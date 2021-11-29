package com.maryland.basket.entity


import com.maryland.basket.AllOpen
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.*

@AllOpen
@Entity
class Product (
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

        @Column(nullable = false)
        var url: String? = null,

        @Column(nullable = false)
        var price: Long? = null,

        var description: String? = null,

        var meta: String? = null
        )