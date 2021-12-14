package com.maryland.basket.configuration

import com.maryland.basket.security.JwtInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class AppConfig : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(JwtInterceptor()).addPathPatterns("/api/v1/**")
    }
    @Bean
    fun jwtTokenInterceptor(): JwtInterceptor = JwtInterceptor()
}
