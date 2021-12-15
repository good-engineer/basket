package com.maryland.basket.entity;

import java.lang.System;

@com.maryland.basket.AllOpen
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0017\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/maryland/basket/entity/OrderRecord;", "", "id", "", "createdAt", "Ljava/util/Date;", "updatedAt", "minCount", "", "maxCount", "deadline", "creator", "Lcom/maryland/basket/entity/User;", "status", "Lcom/maryland/basket/entity/OrderStatus;", "basket", "Lcom/maryland/basket/entity/Basket;", "(Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Lcom/maryland/basket/entity/User;Lcom/maryland/basket/entity/OrderStatus;Lcom/maryland/basket/entity/Basket;)V", "getBasket", "()Lcom/maryland/basket/entity/Basket;", "setBasket", "(Lcom/maryland/basket/entity/Basket;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getCreator", "()Lcom/maryland/basket/entity/User;", "setCreator", "(Lcom/maryland/basket/entity/User;)V", "getDeadline", "setDeadline", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMaxCount", "()Ljava/lang/Integer;", "setMaxCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMinCount", "setMinCount", "getStatus", "()Lcom/maryland/basket/entity/OrderStatus;", "setStatus", "(Lcom/maryland/basket/entity/OrderStatus;)V", "getUpdatedAt", "setUpdatedAt"})
@javax.persistence.Entity
public class OrderRecord {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "created_at", nullable = true)
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    @org.hibernate.annotations.CreationTimestamp
    private java.util.Date createdAt;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(name = "updated_at", nullable = true)
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.TIMESTAMP)
    @org.hibernate.annotations.UpdateTimestamp
    private java.util.Date updatedAt;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(name = "min_count", nullable = true)
    private java.lang.Integer minCount;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(name = "max_count", nullable = true)
    private java.lang.Integer maxCount;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = true)
    private java.util.Date deadline;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.JoinColumn(name = "creator_id", referencedColumnName = "id", nullable = true, foreignKey = @javax.persistence.ForeignKey(name = "fk_o_user_id"))
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private com.maryland.basket.entity.User creator;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(nullable = false)
    private com.maryland.basket.entity.OrderStatus status;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.JoinColumn(name = "basket_id", referencedColumnName = "id", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "fk_o_basket_id"))
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private com.maryland.basket.entity.Basket basket;
    
    public OrderRecord(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull
    java.util.Date updatedAt, @org.jetbrains.annotations.Nullable
    java.lang.Integer minCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer maxCount, @org.jetbrains.annotations.Nullable
    java.util.Date deadline, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User creator, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.OrderStatus status, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Basket basket) {
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
    public java.lang.Integer getMinCount() {
        return null;
    }
    
    public void setMinCount(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getMaxCount() {
        return null;
    }
    
    public void setMaxCount(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.util.Date getDeadline() {
        return null;
    }
    
    public void setDeadline(@org.jetbrains.annotations.Nullable
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.User getCreator() {
        return null;
    }
    
    public void setCreator(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.OrderStatus getStatus() {
        return null;
    }
    
    public void setStatus(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.OrderStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.Basket getBasket() {
        return null;
    }
    
    public void setBasket(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Basket p0) {
    }
}