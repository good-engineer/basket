package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.*

@AllOpen
@Entity
class Order (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (nullable = false)
        var id: Long? = null,

        @CreationTimestamp
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "created_at")
        var createdAt: Date,

        @UpdateTimestamp
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "updated_at")
        var updatedAt: Date,

        @Column(name = "min_count")
        var minCount : Int? = null,

        @Column(name = "max_count")
        var maxCount : Int? = null,

        var deadline : Date? = null,

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "creator")
        var creator : User? = null,

        @Column(nullable = false)
        @ColumnDefault("OPENED")
        var status : Enum<OrderStatus> ? = null,


        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "basket_id", referencedColumnName = "id")
        @Column (nullable = false)
        var basket: Basket? = null,

        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(
                name = "orders_products",
                joinColumns = [JoinColumn(name = "order_id", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "product_id", referencedColumnName = "id")]
        )
        var products: List<Product> = mutableListOf(),

        @OneToMany(fetch = FetchType.EAGER , cascade = [CascadeType.ALL])
        var invoices: List<Invoice> = mutableListOf()

        )

  enum class OrderStatus {
          OPENED, CLOSED, ORDERED, DELIVERED, COMPLETED
  }