package com.maryland.basket.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/maryland/basket/controller/UserController;", "", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "userService", "Lcom/maryland/basket/service/UserService;", "(Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;Lcom/maryland/basket/service/UserService;)V", "getBCryptPasswordEncoder", "()Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "getUserService", "()Lcom/maryland/basket/service/UserService;", "getALlUsers", "", "Lcom/maryland/basket/entity/User;", "hello", "", "signup", "Lorg/springframework/http/ResponseEntity;", "user", "basket"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/"})
@org.springframework.web.bind.annotation.RestController
public class UserController {
    @org.jetbrains.annotations.NotNull
    private final org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder = null;
    @org.jetbrains.annotations.NotNull
    private final com.maryland.basket.service.UserService userService = null;
    
    public UserController(@org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder, @org.jetbrains.annotations.NotNull
    com.maryland.basket.service.UserService userService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder getBCryptPasswordEncoder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.maryland.basket.service.UserService getUserService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/signup"})
    public org.springframework.http.ResponseEntity<java.lang.Object> signup(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.maryland.basket.entity.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/users"})
    public java.util.List<com.maryland.basket.entity.User> getALlUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/hello"})
    public java.lang.String hello() {
        return null;
    }
}