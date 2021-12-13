package com.maryland.basket.security

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.authentication.AuthenticationFailureHandler
import org.springframework.web.server.ResponseStatusException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JwtLoginFailureHandler : AuthenticationFailureHandler {
    private val logger = LoggerFactory.getLogger(this.javaClass)
    override fun onAuthenticationFailure(
        request: HttpServletRequest?,
        response: HttpServletResponse?,
        exception: AuthenticationException?
    ) {
        when (exception) {
            is AuthenticationException -> {
                logger.error("${exception.printStackTrace()}")
            }
        }
        throw ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid Password")
        response?.status = HttpStatus.UNAUTHORIZED.value()
    }
}
