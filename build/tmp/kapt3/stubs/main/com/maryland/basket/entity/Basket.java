package com.maryland.basket.entity;

import java.lang.System;

@com.maryland.basket.AllOpen
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/maryland/basket/entity/Basket;", "", "id", "", "createdAt", "Ljava/util/Date;", "updatedAt", "name", "", "(Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUpdatedAt", "setUpdatedAt", "basket"})
@javax.persistence.Table(name = "basket")
@javax.persistence.Entity
public class Basket {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "created_at")
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    @org.hibernate.annotations.CreationTimestamp
    private java.util.Date createdAt;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "updated_at")
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    @org.hibernate.annotations.UpdateTimestamp
    private java.util.Date updatedAt;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false, length = 100)
    private java.lang.String name;
    
    public Basket(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull
    java.util.Date updatedAt, @org.jetbrains.annotations.Nullable
    java.lang.String name) {
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
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}