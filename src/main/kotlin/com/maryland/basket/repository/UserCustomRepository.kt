package com.maryland.basket.repository

import com.maryland.basket.entity.User

interface UserCustomRepository {
    fun findUserByEmail(email: String?): User?
}
