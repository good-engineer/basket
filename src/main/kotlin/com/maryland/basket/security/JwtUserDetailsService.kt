package com.maryland.basket.security

import com.maryland.basket.repository.user.UserCustomRepository
import org.springframework.http.HttpStatus
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service(value = "userDetailsService")
class JwtUserDetailsService(private val userCustomRepository: UserCustomRepository) :
    UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {

        val user = userCustomRepository.findUserByEmail(username) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found")
        return JwtUser(user)
    }
}
