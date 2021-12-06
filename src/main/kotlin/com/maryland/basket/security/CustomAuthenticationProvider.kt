package com.maryland.basket.security

import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.core.Authentication
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class CustomAuthenticationProvider(private val bCryptPasswordEncoder: BCryptPasswordEncoder) : AuthenticationProvider {
    override fun authenticate(authentication: Authentication?): Authentication {
        TODO("Not yet implemented")
    }

    override fun supports(authentication: Class<*>?): Boolean {
        TODO("Not yet implemented")
    }
}