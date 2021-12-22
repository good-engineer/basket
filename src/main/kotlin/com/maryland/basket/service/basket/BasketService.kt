package com.maryland.basket.service.basket

import com.maryland.basket.entity.Basket
import com.maryland.basket.repository.basket.BasketCustomRepository
import com.maryland.basket.repository.basket.BasketRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service("basketService")
class BasketService(val basketRepository: BasketRepository, val userBasketCustomRepository: BasketCustomRepository) {
    fun getBasket(id: Long): Basket? {
        return basketRepository.findById(id).get()
    }
    fun getBasketsByUserId(id: Long): MutableList<Basket> {
        return userBasketCustomRepository.findBasketsByUserId(id)
    }
    fun createBasket(basket: Basket): Basket? {
        return basketRepository.save(basket)
    }
}
