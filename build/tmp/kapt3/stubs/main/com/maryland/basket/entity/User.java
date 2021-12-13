package com.maryland.basket.entity;

import java.lang.System;

@com.maryland.basket.AllOpen
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\'\b\u0017\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0015R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0010\u001a\u00020\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010,\"\u0004\b-\u0010.R \u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R \u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R \u0010\u000e\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001e\u00a8\u0006;"}, d2 = {"Lcom/maryland/basket/entity/User;", "", "id", "", "createdAt", "Ljava/util/Date;", "updatedAt", "email", "", "name", "gender", "Lcom/maryland/basket/entity/Gender;", "age", "", "phoneNumber", "password", "isActive", "", "role", "", "Lcom/maryland/basket/entity/Role;", "(Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/maryland/basket/entity/Gender;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Enum;)V", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getGender", "()Lcom/maryland/basket/entity/Gender;", "setGender", "(Lcom/maryland/basket/entity/Gender;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Z", "setActive", "(Z)V", "getName", "setName", "getPassword", "setPassword", "getPhoneNumber", "setPhoneNumber", "getRole", "()Ljava/lang/Enum;", "setRole", "(Ljava/lang/Enum;)V", "getUpdatedAt", "setUpdatedAt", "basket"})
@javax.persistence.Entity
public class User {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "created_at", nullable = false)
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    @org.hibernate.annotations.CreationTimestamp
    private java.util.Date createdAt;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "updated_at", nullable = false)
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    @org.hibernate.annotations.UpdateTimestamp
    private java.util.Date updatedAt;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false, unique = true)
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(nullable = true)
    private com.maryland.basket.entity.Gender gender;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = true)
    private java.lang.Integer age;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = true, name = "phone_number")
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    private java.lang.String password;
    @javax.persistence.Column(nullable = false, name = "is_active")
    private boolean isActive;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(nullable = false)
    private java.lang.Enum<com.maryland.basket.entity.Role> role;
    
    public User(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull
    java.util.Date updatedAt, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Gender gender, @org.jetbrains.annotations.Nullable
    java.lang.Integer age, @org.jetbrains.annotations.Nullable
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable
    java.lang.String password, boolean isActive, @org.jetbrains.annotations.Nullable
    java.lang.Enum<com.maryland.basket.entity.Role> role) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.Date getCreatedAt() {
        return null;
    }
    
    public void setCreatedAt(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.Date getUpdatedAt() {
        return null;
    }
    
    public void setUpdatedAt(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.Gender getGender() {
        return null;
    }
    
    public void setGender(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Gender p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getAge() {
        return null;
    }
    
    public void setAge(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getPhoneNumber() {
        return null;
    }
    
    public void setPhoneNumber(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getPassword() {
        return null;
    }
    
    public void setPassword(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public boolean isActive() {
        return false;
    }
    
    public void setActive(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Enum<com.maryland.basket.entity.Role> getRole() {
        return null;
    }
    
    public void setRole(@org.jetbrains.annotations.Nullable
    java.lang.Enum<com.maryland.basket.entity.Role> p0) {
    }
}