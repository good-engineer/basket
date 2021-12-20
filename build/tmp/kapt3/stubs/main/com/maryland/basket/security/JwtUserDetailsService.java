package com.maryland.basket.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/maryland/basket/security/JwtUserDetailsService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "userCustomRepository", "Lcom/maryland/basket/repository/UserCustomRepository;", "(Lcom/maryland/basket/repository/UserCustomRepository;)V", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "", "basket"})
@org.springframework.stereotype.Service(value = "userDetailsService")
public class JwtUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private final com.maryland.basket.repository.UserCustomRepository userCustomRepository = null;
    
    public JwtUserDetailsService(@org.jetbrains.annotations.NotNull
    com.maryland.basket.repository.UserCustomRepository userCustomRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.Nullable
    java.lang.String username) {
        return null;
    }
}