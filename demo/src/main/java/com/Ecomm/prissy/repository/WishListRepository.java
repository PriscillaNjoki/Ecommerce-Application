package com.Ecomm.prissy.repository;

import com.Ecomm.prissy.model.User;
import com.Ecomm.prissy.model.WishList;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishListRepository extends JpaRepository<WishList, Integer> {
    List<WishList> findAllByUserOrderByCreatedDateDesc(User user);

}
