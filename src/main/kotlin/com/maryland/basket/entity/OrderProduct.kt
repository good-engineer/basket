package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.persistence.UniqueConstraint

@AllOpen
@Entity
@Table(name = "order_product", uniqueConstraints = [UniqueConstraint(columnNames = ["order_id", "product_id"])])
class OrderProduct(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @OneToOne()
    @JoinColumn(name = "product_id", nullable = false, referencedColumnName = "id")
    var product: Product? = null,

    @OneToOne()
    @JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id")
    var order: Order? = null
)
