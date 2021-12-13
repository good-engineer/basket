package com.maryland.basket.security

import com.maryland.basket.constant.AuthConstants
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException
import org.springframework.web.servlet.HandlerInterceptor
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JwtInterceptor : HandlerInterceptor {
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        val header = request.getHeader(AuthConstants.AUTH_HEADER)

        header?.let {
            val token = TokenUtils.getTokenFromHeader(it)
            return TokenUtils.isValidToken(token)
        }

        throw ResponseStatusException(HttpStatus.UNAUTHORIZED, "Unauthorized")
        return false
    }
}
