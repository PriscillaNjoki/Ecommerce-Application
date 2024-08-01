package com.Ecomm.prissy.controller;

import com.Ecomm.prissy.common.ApiResponse;
import com.Ecomm.prissy.dto.ProductDto;
import com.Ecomm.prissy.model.Product;
import com.Ecomm.prissy.model.User;
import com.Ecomm.prissy.model.WishList;
import com.Ecomm.prissy.service.AuthenticationService;
import com.Ecomm.prissy.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
public class WishListController {
    @Autowired
    WishListService wishListService;

    @Autowired
    AuthenticationService authenticationService;
@PostMapping("/add")
public ResponseEntity<ApiResponse>addToWishList(@RequestBody Product product, @RequestParam("token") String token){
    // authenticate the token
    authenticationService.authenticate(token);


    // find the user
    User user = authenticationService.getUser(token);

    // save the item in wishlist
    WishList wishList = new WishList(user, product);

    wishListService.createWishlist(wishList);

    ApiResponse apiResponse = new ApiResponse(true, "Added to wishlist");
    return  new ResponseEntity<>(apiResponse, HttpStatus.CREATED);

}
// get all wishlist item for a user

    @GetMapping("/{token}")
    public ResponseEntity<List<ProductDto>> getWishList(@PathVariable("token") String token) {

        // authenticate the token
        authenticationService.authenticate(token);


        // find the user

        User user = authenticationService.getUser(token);

        List<ProductDto> productDtos = wishListService.getWishListForUser(user);

        return new ResponseEntity<>(productDtos, HttpStatus.OK);

    }

}

