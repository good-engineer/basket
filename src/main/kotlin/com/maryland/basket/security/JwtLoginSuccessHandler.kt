package com.maryland.basket.security

import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JwtLoginSuccessHandler : SavedRequestAwareAuthenticationSuccessHandler() {
    override fun onAuthenticationSuccess(
        request: HttpServletRequest?,
        response: HttpServletResponse?,
        authentication: Authentication?
    ) {
        val user = (authentication?.principal as JwtUser).user
        val jwtToken = TokenUtils.generateJwtToken(user)
        response?.setHeader("Authorization", "Barear " + jwtToken)
    }
}
