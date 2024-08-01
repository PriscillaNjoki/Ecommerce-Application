package com.Ecomm.prissy.controller;

import com.Ecomm.prissy.dto.ResponseDto;
import com.Ecomm.prissy.dto.user.SignInDto;
import com.Ecomm.prissy.dto.user.SignInResponseDto;
import com.Ecomm.prissy.dto.user.SignupDto;
import com.Ecomm.prissy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserService userService;

    //sign up and sign in apis
    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signin")
    public SignInResponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }
}
