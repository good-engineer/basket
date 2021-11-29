package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.*

@AllOpen
@Entity
class User (
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

    @Column(nullable = false, unique = true)
    var email : String? = null,

    @Column(nullable = false)
    var name: String? = null,

    var gender: Gender? = null,

    var age: Int? = null,

    @ManyToMany(fetch = FetchType.LAZY )
    @JoinTable(
            name = "user_basket",
            joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
            inverseJoinColumns = [JoinColumn(name = "basket_id", referencedColumnName = "id")]
    )
    var baskets: List<Basket> = mutableListOf()
)

enum class Gender {
    FEMALE, MALE
}