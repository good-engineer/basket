package com.maryland.basket.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004\u00a8\u0006\u0016"}, d2 = {"Lcom/maryland/basket/security/JwtUser;", "Lorg/springframework/security/core/userdetails/UserDetails;", "user", "Lcom/maryland/basket/entity/User;", "(Lcom/maryland/basket/entity/User;)V", "authorities", "", "Lorg/springframework/security/core/authority/SimpleGrantedAuthority;", "getUser", "()Lcom/maryland/basket/entity/User;", "setUser", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "getPassword", "", "getUsername", "isAccountNonExpired", "", "isAccountNonLocked", "isCredentialsNonExpired", "isEnabled", "basket"})
@org.springframework.stereotype.Component
public class JwtUser implements org.springframework.security.core.userdetails.UserDetails {
    @org.jetbrains.annotations.Nullable
    private com.maryland.basket.entity.User user;
    private java.util.List<org.springframework.security.core.authority.SimpleGrantedAuthority> authorities;
    
    public JwtUser() {
        super();
    }
    
    public JwtUser(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User user) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.User getUser() {
        return null;
    }
    
    public void setUser(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override
    public boolean isAccountNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isAccountNonLocked() {
        return false;
    }
    
    @java.lang.Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isEnabled() {
        return false;
    }
}