package com.maryland.basket.entity

import com.maryland.basket.AllOpen
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.security.core.GrantedAuthority
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType
import javax.persistence.Enumerated
import javax.persistence.EnumType

@AllOpen
@Entity
class User(
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

    @Column(nullable = false, unique = true)
    var email: String? = null,

    @Column(nullable = false)
    var name: String? = null,

    @Column(nullable = true) @Enumerated(EnumType.STRING)
    var gender: Gender? = null,

    @Column(nullable = true)
    var age: Int? = null,

    @Column(nullable = true, name = "phone_number")
    var phoneNumber: String? = null,

    @Column(nullable = false)
    var password: String? = null,

    @Column(nullable = false, name = "is_active")
    var isActive: Boolean = true,

    @Column(nullable = false) @Enumerated(EnumType.STRING)
    var role: Enum<Role> ? = Role.USER
)

enum class Gender {
    FEMALE, MALE
}
enum class Role(val key: String, val value: String) : GrantedAuthority {
    ADMIN("ADMIN", "관리자") {
        override fun getAuthority(): String {
            return this.value
        }
    },
    USER("USER", "유저") {
        override fun getAuthority(): String {
            return this.value
        }
    }
}
