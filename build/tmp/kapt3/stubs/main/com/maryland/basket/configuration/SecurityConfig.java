package com.maryland.basket.configuration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0017\u00a8\u0006\u0011"}, d2 = {"Lcom/maryland/basket/configuration/SecurityConfig;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "JwtAuthenticationProvider", "Lcom/maryland/basket/security/JwtAuthenticationProvider;", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "configure", "", "auth", "Lorg/springframework/security/config/annotation/authentication/builders/AuthenticationManagerBuilder;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "web", "Lorg/springframework/security/config/annotation/web/builders/WebSecurity;", "jwtAuthenticationFilter", "Lcom/maryland/basket/security/JwtAuthenticationFilter;", "basket"})
@org.springframework.context.annotation.Configuration
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
public class SecurityConfig extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    
    public SecurityConfig() {
        super();
    }
    
    @java.lang.Override
    public void configure(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.web.builders.WebSecurity web) {
    }
    
    @java.lang.Override
    protected void configure(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
    }
    
    @java.lang.Override
    protected void configure(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public com.maryland.basket.security.JwtAuthenticationProvider JwtAuthenticationProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public com.maryland.basket.security.JwtAuthenticationFilter jwtAuthenticationFilter() {
        return null;
    }
}