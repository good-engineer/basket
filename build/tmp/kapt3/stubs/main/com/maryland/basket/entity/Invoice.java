package com.maryland.basket.entity;

import java.lang.System;

@com.maryland.basket.AllOpen
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0017\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001e\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019\u00a8\u0006."}, d2 = {"Lcom/maryland/basket/entity/Invoice;", "", "id", "", "createdAt", "Ljava/util/Date;", "updatedAt", "order", "Lcom/maryland/basket/entity/Order;", "status", "Lcom/maryland/basket/entity/InvoiceStatus;", "from", "Lcom/maryland/basket/entity/User;", "to", "amount", "completedAt", "(Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;Lcom/maryland/basket/entity/Order;Lcom/maryland/basket/entity/InvoiceStatus;Lcom/maryland/basket/entity/User;Lcom/maryland/basket/entity/User;Ljava/lang/Long;Ljava/util/Date;)V", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCompletedAt", "()Ljava/util/Date;", "setCompletedAt", "(Ljava/util/Date;)V", "getCreatedAt", "setCreatedAt", "getFrom", "()Lcom/maryland/basket/entity/User;", "setFrom", "(Lcom/maryland/basket/entity/User;)V", "getId", "setId", "getOrder", "()Lcom/maryland/basket/entity/Order;", "setOrder", "(Lcom/maryland/basket/entity/Order;)V", "getStatus", "()Lcom/maryland/basket/entity/InvoiceStatus;", "setStatus", "(Lcom/maryland/basket/entity/InvoiceStatus;)V", "getTo", "setTo", "getUpdatedAt", "setUpdatedAt", "basket"})
@javax.persistence.Entity
public class Invoice {
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
    @javax.persistence.JoinColumn(name = "order_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private com.maryland.basket.entity.Order order;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(nullable = false)
    private com.maryland.basket.entity.InvoiceStatus status;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.JoinColumn(name = "from_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private com.maryland.basket.entity.User from;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.JoinColumn(name = "to_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER)
    private com.maryland.basket.entity.User to;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = true)
    private java.lang.Long amount;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(name = "completed_at", nullable = false)
    private java.util.Date completedAt;
    
    public Invoice(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt, @org.jetbrains.annotations.NotNull
    java.util.Date updatedAt, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Order order, @org.jetbrains.annotations.NotNull
    com.maryland.basket.entity.InvoiceStatus status, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User from, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User to, @org.jetbrains.annotations.Nullable
    java.lang.Long amount, @org.jetbrains.annotations.Nullable
    java.util.Date completedAt) {
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
    public com.maryland.basket.entity.Order getOrder() {
        return null;
    }
    
    public void setOrder(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Order p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public com.maryland.basket.entity.InvoiceStatus getStatus() {
        return null;
    }
    
    public void setStatus(@org.jetbrains.annotations.NotNull
    com.maryland.basket.entity.InvoiceStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.User getFrom() {
        return null;
    }
    
    public void setFrom(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.User getTo() {
        return null;
    }
    
    public void setTo(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getAmount() {
        return null;
    }
    
    public void setAmount(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.util.Date getCompletedAt() {
        return null;
    }
    
    public void setCompletedAt(@org.jetbrains.annotations.Nullable
    java.util.Date p0) {
    }
}