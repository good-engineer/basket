package com.maryland.basket.security

import com.maryland.basket.entity.User
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Component

@Component
class JwtUser (var user : User? =null): UserDetails {

//    var id: Long? = null
//    var name: String? = null
//    var email: String? = null
//    var password = null
    private var authorities = mutableListOf(SimpleGrantedAuthority(user?.role.toString()))

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
       return authorities
    }

    override fun getPassword(): String? {
      return  user?.password
    }

    override fun getUsername(): String? {
        return user?.email
    }

    override fun isAccountNonExpired(): Boolean {
        return user?.isActive!!
    }

    override fun isAccountNonLocked(): Boolean {
        return user?.isActive !!
    }

    override fun isCredentialsNonExpired(): Boolean {
        return user?.isActive !!
    }

    override fun isEnabled(): Boolean {
        return user?.isActive !!
    }
}