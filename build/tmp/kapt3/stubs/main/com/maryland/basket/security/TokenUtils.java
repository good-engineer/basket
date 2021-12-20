package com.maryland.basket.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b7\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/maryland/basket/security/TokenUtils;", "", "()V", "Companion", "basket"})
@org.springframework.stereotype.Component
public abstract class TokenUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.maryland.basket.security.TokenUtils.Companion Companion = null;
    
    private TokenUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0005\u00a8\u0006\u0017"}, d2 = {"Lcom/maryland/basket/security/TokenUtils$Companion;", "", "()V", "createClaims", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "user", "Lcom/maryland/basket/entity/User;", "createExpireDate", "Ljava/util/Date;", "createHeader", "", "createSigningKey", "Ljava/security/Key;", "generateJwtToken", "getClaimsFromToken", "Lio/jsonwebtoken/Claims;", "token", "getTokenFromHeader", "header", "isValidToken", "", "basket"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String generateJwtToken(@org.jetbrains.annotations.Nullable
        com.maryland.basket.entity.User user) {
            return null;
        }
        
        public final boolean isValidToken(@org.jetbrains.annotations.NotNull
        java.lang.String token) {
            return false;
        }
        
        private final io.jsonwebtoken.Claims getClaimsFromToken(java.lang.String token) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTokenFromHeader(@org.jetbrains.annotations.NotNull
        java.lang.String header) {
            return null;
        }
        
        private final java.util.Map<java.lang.String, java.lang.Object> createHeader() {
            return null;
        }
        
        private final java.util.HashMap<java.lang.String, java.lang.Object> createClaims(com.maryland.basket.entity.User user) {
            return null;
        }
        
        private final java.util.Date createExpireDate() {
            return null;
        }
        
        private final java.security.Key createSigningKey() {
            return null;
        }
    }
}