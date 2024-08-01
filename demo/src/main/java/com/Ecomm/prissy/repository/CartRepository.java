package com.Ecomm.prissy.repository;

import com.Ecomm.prissy.model.Cart;
import com.Ecomm.prissy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}
