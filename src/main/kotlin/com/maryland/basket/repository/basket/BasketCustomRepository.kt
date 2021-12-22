package com.maryland.basket.repository.basket

import com.maryland.basket.entity.Basket

interface BasketCustomRepository {
    fun findBasketsByUserId(id: Long): MutableList<Basket>
//    fun findUsersByBasketId(id: Long): MutableList<User>
}
