package com.maryland.basket.security

import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class CustomAuthenticationFilter(authenticationManager: AuthenticationManager) : UsernamePasswordAuthenticationFilter(authenticationManager) {
    override fun attemptAuthentication(request: HttpServletRequest, response: HttpServletResponse): Authentication {
        val authRequest: UsernamePasswordAuthenticationToken

        if(!request.method.equals("POST")){
            throw
                     ChangeSetPersister.NotFoundException()

        }
        //todo:
    }
}
