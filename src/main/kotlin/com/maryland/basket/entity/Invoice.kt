package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.ForeignKey
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Temporal
import javax.persistence.TemporalType

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
    @JoinColumn(name = "order_id", nullable = false, foreignKey = ForeignKey(name = "fk_i_order_id"))
    var order: OrderRecord? = null,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var status: InvoiceStatus? = InvoiceStatus.CREATED,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "from_id", nullable = false, foreignKey = ForeignKey(name = "fk_from_user_id"))
    var from: User? = null,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_id", nullable = false, foreignKey = ForeignKey(name = "fk_to_user_id"))
    var to: User? = null,

    @Column(nullable = true)
    var amount: Long? = null,

    @Column(name = "completed_at", nullable = false)
    var completedAt: Date? = null

)
enum class InvoiceStatus {
    CREATED, CONFIRMED, PAID, CANCELED
}
