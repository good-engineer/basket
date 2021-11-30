package com.maryland.basket.repository

import com.maryland.basket.entity.User

interface UserCustomRepository {
    fun getUserByEmail(email: String): User?
}
