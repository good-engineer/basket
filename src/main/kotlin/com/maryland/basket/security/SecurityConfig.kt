package com.maryland.basket.security

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@EnableWebSecurity
@EnableGlobalMethodSecurity(
    prePostEnabled = true
)
class SecurityConfig {
//    private val unauthorizedHandler: JwtAuthenticationEntryPoint,
}
