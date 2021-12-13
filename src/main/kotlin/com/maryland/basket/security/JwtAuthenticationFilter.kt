package com.maryland.basket.security

import com.fasterxml.jackson.databind.ObjectMapper
import com.maryland.basket.entity.User
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.http.HttpStatus
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.stereotype.Component
import org.springframework.web.server.ResponseStatusException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class JwtAuthenticationFilter(authenticationManager: AuthenticationManager) : UsernamePasswordAuthenticationFilter(authenticationManager) {
    override fun attemptAuthentication(request: HttpServletRequest, response: HttpServletResponse): Authentication {
        val authRequest: UsernamePasswordAuthenticationToken

        if(!request.method.equals("POST")){
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Method")

        }
        val user = ObjectMapper().readValue(request.inputStream, User::class.java)

        if(user.email.isNullOrEmpty()|| user.password.isNullOrEmpty()){
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Email and password not found.")
        }
        authRequest = UsernamePasswordAuthenticationToken(user.email, user.password)
        setDetails(request,authRequest)

        return this.authenticationManager.authenticate(authRequest)
    }
}
