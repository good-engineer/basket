package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.*

@AllOpen
@Entity
class Invoice (
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

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "order_id")
        var order : Order? = null,

        @Column(nullable = false)
        @ColumnDefault("CREATED")
        var status : InvoiceStatus? = null,

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "from_id")
        var from: User? = null,

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "to_id")
        var to: User? = null,

        var amount: Long? = null,

        @Column(name = "completed_at")
        var completedAt : Date? = null

        )
enum class InvoiceStatus {
        CREATED, CONFIRMED, PAID , CANCELED
}