package com.maryland.basket.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/maryland/basket/security/JwtAuthenticationProvider;", "Lorg/springframework/security/authentication/AuthenticationProvider;", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "(Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;)V", "jwtUserDetailsService", "Lcom/maryland/basket/security/JwtUserDetailsService;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "authenticate", "Lorg/springframework/security/core/Authentication;", "authentication", "supports", "", "Ljava/lang/Class;", "basket"})
@org.springframework.stereotype.Component
public class JwtAuthenticationProvider implements org.springframework.security.authentication.AuthenticationProvider {
    private final org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder = null;
    @javax.annotation.Resource
    private com.maryland.basket.security.JwtUserDetailsService jwtUserDetailsService;
    private final org.slf4j.Logger logger = null;
    
    public JwtAuthenticationProvider(@org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.springframework.security.core.Authentication authenticate(@org.jetbrains.annotations.Nullable
    org.springframework.security.core.Authentication authentication) {
        return null;
    }
    
    @java.lang.Override
    public boolean supports(@org.jetbrains.annotations.Nullable
    java.lang.Class<?> authentication) {
        return false;
    }
}