package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ForeignKey
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, referencedColumnName = "id", foreignKey = ForeignKey(name = "fk_op_product_id"))
    var product: Product? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id", foreignKey = ForeignKey(name = "fk_op_order_id"))
    var order: OrderRecord? = null
)
