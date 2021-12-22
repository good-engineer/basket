package com.maryland.basket.controller

import com.maryland.basket.entity.User
import com.maryland.basket.security.TokenUtils
import com.maryland.basket.service.user.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class UserController(
    val userService: UserService
) {

    @PostMapping("/signup")
    fun signup(@RequestBody user: User): ResponseEntity<Any> {

        return if (userService.findByEmail(user.email) != null) {
            ResponseEntity.badRequest().build()
        } else {
            ResponseEntity.ok().body(TokenUtils.generateJwtToken(userService.signUp(user)))
        }
    }

    @GetMapping("/myinfo")
    fun getUserInfo(@RequestHeader("Authorization") header: String): ResponseEntity<Any> {
        val token = TokenUtils.getTokenFromHeader(header)
        val claims = TokenUtils.getClaimsFromToken(token)
        var user = userService.findByEmail(claims?.subject)
        user?.let {
            return ResponseEntity.ok().body(it)
        }
        return ResponseEntity.badRequest().build()
    }
}
