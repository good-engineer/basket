package com.maryland.basket.repository.user

import com.maryland.basket.entity.User

interface UserCustomRepository {
    fun findUserByEmail(email: String?): User?
}
