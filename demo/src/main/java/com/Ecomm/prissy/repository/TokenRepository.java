package com.Ecomm.prissy.repository;

import com.Ecomm.prissy.model.AuthenticationToken;
import com.Ecomm.prissy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {
    AuthenticationToken findByUser(User user);
    AuthenticationToken findByToken(String token);
}

