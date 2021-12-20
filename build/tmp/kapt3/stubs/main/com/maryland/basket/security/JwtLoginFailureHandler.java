package com.maryland.basket.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/maryland/basket/security/JwtLoginFailureHandler;", "Lorg/springframework/security/web/authentication/AuthenticationFailureHandler;", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "onAuthenticationFailure", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "exception", "Lorg/springframework/security/core/AuthenticationException;", "basket"})
public final class JwtLoginFailureHandler implements org.springframework.security.web.authentication.AuthenticationFailureHandler {
    private final org.slf4j.Logger logger = null;
    
    public JwtLoginFailureHandler() {
        super();
    }
    
    @java.lang.Override
    public void onAuthenticationFailure(@org.jetbrains.annotations.Nullable
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.Nullable
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.Nullable
    org.springframework.security.core.AuthenticationException exception) {
    }
}