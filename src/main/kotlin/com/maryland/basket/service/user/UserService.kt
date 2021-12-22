package com.maryland.basket.service.user

import com.maryland.basket.entity.Role
import com.maryland.basket.entity.User
import com.maryland.basket.repository.user.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service("userService")
class UserService(
    val userRepository: UserRepository,
    val bCryptPasswordEncoder: BCryptPasswordEncoder
) {
    fun findByEmail(email: String?): User? {
        return userRepository.findUserByEmail(email)
    }

    fun signUp(user: User): User {
        user.password = bCryptPasswordEncoder.encode(user.password)
        user.isActive = true
        user.role = Role.USER
        return userRepository.save(user)
    }

    fun getUserList(): List<User> {
        return userRepository.findAll()
    }
}
