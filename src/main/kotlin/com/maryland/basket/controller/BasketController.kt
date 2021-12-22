package com.maryland.basket.controller

import com.maryland.basket.entity.Basket
import com.maryland.basket.service.basket.BasketService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/basket")
class BasketController(val basketService: BasketService) {
    @PostMapping("")
    fun createBasket(@RequestBody basket: Basket): ResponseEntity<Any> {
        val basket = basketService.createBasket(basket)
        basket?.let { return ResponseEntity.ok().body(it) }
        return ResponseEntity.badRequest().build()
    }
    @GetMapping("")
    fun getBasket(@RequestParam id: Long): ResponseEntity<Any> {
        val basket = basketService.getBasket(id)
        basket?.let { return ResponseEntity.ok().body(it) }
        return ResponseEntity.notFound().build()
    }
}
