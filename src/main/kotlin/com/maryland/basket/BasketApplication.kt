package com.maryland.basket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasketApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<BasketApplication>(*args)
}
