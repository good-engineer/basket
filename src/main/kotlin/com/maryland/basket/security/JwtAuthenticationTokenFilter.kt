package com.maryland.basket.security

import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component

@Component
class JwtAuthenticationTokenFilter(
        private val userDetailsService: UserDetailsService,
        private val jwtTokenUtils: JwtTokenUtils
)
