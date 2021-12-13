package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType
import javax.persistence.ManyToOne
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.Enumerated
import javax.persistence.EnumType

@AllOpen
@Entity
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = true)
    var createdAt: Date,

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = true)
    var updatedAt: Date,

    @Column(name = "min_count", nullable = true)
    var minCount: Int? = null,

    @Column(name = "max_count", nullable = true)
    var maxCount: Int? = null,

    @Column(nullable = true)
    var deadline: Date? = null,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "creator_id", nullable = true)
    var creator: User? = null,

    @Column(nullable = false) @Enumerated(EnumType.STRING)
    var status: Enum<OrderStatus> = OrderStatus.OPENED,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "basket_id", referencedColumnName = "id", nullable = false)
    var basket: Basket? = null

)

enum class OrderStatus {
    OPENED, CLOSED, ORDERED, DELIVERED, COMPLETED
}
