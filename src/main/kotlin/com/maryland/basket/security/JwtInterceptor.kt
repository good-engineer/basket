package com.maryland.basket.security

import com.maryland.basket.constant.AuthConstants
import org.springframework.web.servlet.HandlerInterceptor
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse



class JwtInterceptor : HandlerInterceptor{
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        val header = request.getHeader(AuthConstants.AUTH_HEADER)

        header?.let {
            val token =
        }

        return super.preHandle(request, response, handler)
    }
}

