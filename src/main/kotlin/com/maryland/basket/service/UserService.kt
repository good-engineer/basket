package com.maryland.basket.service

import com.maryland.basket.entity.User
import com.maryland.basket.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service("userService")
class UserService(val userRepository: UserRepository) {
    fun findByEmail(email: String?): User? {
        return userRepository.findUserByEmail(email)
    }

    fun signUp(user: User): User {
        return userRepository.save(user)
    }

    fun getUserList(): List<User> {
        return userRepository.findAll()
    }
}
