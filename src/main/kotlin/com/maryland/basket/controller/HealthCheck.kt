package com.maryland.basket.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/healthcheck")
class HealthCheck {
    @GetMapping("/hello")
    fun hello(): String {
        println("******hello********")
        return "Hello"
    }
}