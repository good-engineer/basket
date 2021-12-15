package com.maryland.basket.configuration

import com.maryland.basket.security.JwtAuthenticationFilter
import com.maryland.basket.security.JwtAuthenticationProvider
import com.maryland.basket.security.JwtLoginFailureHandler
import com.maryland.basket.security.JwtLoginSuccessHandler
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

@EnableWebSecurity
@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {
    override fun configure(web: WebSecurity) {
        web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations())
    }
    override fun configure(http: HttpSecurity) {
        http
            .headers().frameOptions().sameOrigin()
            .and()
            .csrf().disable().authorizeRequests()
            .anyRequest().permitAll()
            .and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .formLogin().disable()
            .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter::class.java)
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.authenticationProvider(JwtAuthenticationProvider())
    }

    @Bean
    fun JwtAuthenticationProvider(): JwtAuthenticationProvider {
        return JwtAuthenticationProvider(bCryptPasswordEncoder())
    }

    @Bean
    fun bCryptPasswordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun jwtAuthenticationFilter(): JwtAuthenticationFilter {
        val jwtAuthenticationFilter = JwtAuthenticationFilter(authenticationManager())
        jwtAuthenticationFilter.setFilterProcessesUrl("/api/v1/login")
        jwtAuthenticationFilter.setAuthenticationSuccessHandler(JwtLoginSuccessHandler())
        jwtAuthenticationFilter.setAuthenticationFailureHandler(JwtLoginFailureHandler())
        return jwtAuthenticationFilter
    }
}
