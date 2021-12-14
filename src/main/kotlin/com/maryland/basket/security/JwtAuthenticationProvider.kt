package com.maryland.basket.security

import org.springframework.http.HttpStatus
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component
import org.springframework.web.server.ResponseStatusException
import javax.annotation.Resource

@Component
class JwtAuthenticationProvider(private val bCryptPasswordEncoder: BCryptPasswordEncoder) : AuthenticationProvider {

    @Resource
    private lateinit var jwtUserDetailsService: JwtUserDetailsService

    // 인증 메서드
    override fun authenticate(authentication: Authentication?): Authentication {
        lateinit var token: Authentication
        if (authentication is UsernamePasswordAuthenticationToken) {
            token = authentication
        }
        val email = token.name
        val pass = token.credentials as String
        val user = jwtUserDetailsService.loadUserByUsername(email)

        if (!bCryptPasswordEncoder.matches(pass, user.password)) {
            throw ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid Password")
        }
        return UsernamePasswordAuthenticationToken(user, pass, user.authorities)
    }

    override fun supports(authentication: Class<*>?): Boolean {
        // authenticate 메서드에 넣을 authentication 이 인증가능할지 확인하는 메서드
        return authentication == UsernamePasswordAuthenticationToken::class.java
    }
}
