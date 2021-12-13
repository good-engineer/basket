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
class Invoice(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    var createdAt: Date,

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    var updatedAt: Date,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    var order: Order? = null,

    @Column(nullable = false) @Enumerated(EnumType.STRING)
    var status: InvoiceStatus = InvoiceStatus.CREATED,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "from_id", nullable = false)
    var from: User? = null,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_id", nullable = false)
    var to: User? = null,

    @Column(nullable = true)
    var amount: Long? = null,

    @Column(name = "completed_at", nullable = false)
    var completedAt: Date? = null

)
enum class InvoiceStatus {
    CREATED, CONFIRMED, PAID, CANCELED
}
