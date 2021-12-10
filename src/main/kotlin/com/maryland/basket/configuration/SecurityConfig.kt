package com.maryland.basket.configuration

import com.maryland.basket.security.JwtAuthenticationProvider
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@EnableWebSecurity
@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {
    override fun configure(web: WebSecurity) {
        web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations())
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.authenticationProvider(JwtAuthenticationProvider())
    }


    @Bean
    fun JwtAuthenticationProvider(): JwtAuthenticationProvider {
        return JwtAuthenticationProvider(bCryptPasswordEncoder())
    }

    @Bean
    fun bCryptPasswordEncoder():BCryptPasswordEncoder{
        return BCryptPasswordEncoder()
    }

//    @Bean
//    fun customAuthenticationFilter(): JwtAuthenticationFilter{
//        //TODO:
//    }
}
