package com.maryland.basket.entity;

import java.lang.System;

@com.maryland.basket.AllOpen
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/maryland/basket/entity/OrderProduct;", "", "id", "", "product", "Lcom/maryland/basket/entity/Product;", "order", "Lcom/maryland/basket/entity/OrderRecord;", "(Ljava/lang/Long;Lcom/maryland/basket/entity/Product;Lcom/maryland/basket/entity/OrderRecord;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOrder", "()Lcom/maryland/basket/entity/OrderRecord;", "setOrder", "(Lcom/maryland/basket/entity/OrderRecord;)V", "getProduct", "()Lcom/maryland/basket/entity/Product;", "setProduct", "(Lcom/maryland/basket/entity/Product;)V", "basket"})
@javax.persistence.Table(name = "order_product", uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"order_id", "product_id"})})
@javax.persistence.Entity
public class OrderProduct {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Column(nullable = false)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.JoinColumn(name = "product_id", nullable = false, referencedColumnName = "id", foreignKey = @javax.persistence.ForeignKey(name = "fk_op_product_id"))
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private com.maryland.basket.entity.Product product;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id", foreignKey = @javax.persistence.ForeignKey(name = "fk_op_order_id"))
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private com.maryland.basket.entity.OrderRecord order;
    
    public OrderProduct() {
        super();
    }
    
    public OrderProduct(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Product product, @org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.OrderRecord order) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.Product getProduct() {
        return null;
    }
    
    public void setProduct(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.Product p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.maryland.basket.entity.OrderRecord getOrder() {
        return null;
    }
    
    public void setOrder(@org.jetbrains.annotations.Nullable
    com.maryland.basket.entity.OrderRecord p0) {
    }
}