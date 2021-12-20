package com.maryland.basket.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/maryland/basket/service/UserService;", "", "userRepository", "Lcom/maryland/basket/repository/UserRepository;", "(Lcom/maryland/basket/repository/UserRepository;)V", "getUserRepository", "()Lcom/maryland/basket/repository/UserRepository;", "findByEmail", "Lcom/maryland/basket/entity/User;", "email", "", "getUserList", "", "signUp", "user", "basket"})
@org.springframework.stereotype.Service(value = "userService")
public class UserService {
    @org.jetbrains.annotations.NotNull
    private final com.maryland.basket.repository.UserRepository userRepository = null;
    
    public UserService(@org.jetbrains.annotations.NotNull
    com.maryland.basket.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.maryland.basket.repository.UserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.User findByEmail(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.maryland.basket.entity.User signUp(@org.jetbrains.annotations.NotNull
    com.maryland.basket.entity.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.maryland.basket.entity.User> getUserList() {
        return null;
    }
}