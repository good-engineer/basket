package com.maryland.basket.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/maryland/basket/security/JwtLoginSuccessHandler;", "Lorg/springframework/security/web/authentication/SavedRequestAwareAuthenticationSuccessHandler;", "()V", "onAuthenticationSuccess", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "authentication", "Lorg/springframework/security/core/Authentication;", "basket"})
public final class JwtLoginSuccessHandler extends org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler {
    
    public JwtLoginSuccessHandler() {
        super();
    }
    
    @java.lang.Override
    public void onAuthenticationSuccess(@org.jetbrains.annotations.Nullable
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.Nullable
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.Nullable
    org.springframework.security.core.Authentication authentication) {
    }
}