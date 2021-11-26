package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.*

@AllOpen
@Entity
class Basket (
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

        @Column(nullable = false)
        var name: String? = null,

        @ManyToMany(fetch = FetchType.EAGER , mappedBy = "baskets")
        var users: List<User> = mutableListOf(),

        @ManyToMany(fetch = FetchType.EAGER )
        @JoinTable(
                name = "baskets_products",
                joinColumns = [JoinColumn(name = "basket_id", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "product_id", referencedColumnName = "id")]
        )
        var products: List<Product>  = mutableListOf(),

        @OneToMany(fetch = FetchType.EAGER, mappedBy = "basket" , cascade = [CascadeType.ALL])
        var orders: List<Order>  = mutableListOf()



        )