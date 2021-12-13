package com.maryland.basket.controller

import com.maryland.basket.entity.Role
import com.maryland.basket.entity.User
import com.maryland.basket.security.TokenUtils
import com.maryland.basket.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/")
class UserController(val bCryptPasswordEncoder: BCryptPasswordEncoder, val userService: UserService) {
    @PostMapping("/signup")
    fun signup(@RequestBody user: User): ResponseEntity<Any> {
        user.password = bCryptPasswordEncoder.encode(user.password)
        user.role = Role.USER
        return if (userService.findByEmail(user.email) == null) {
            ResponseEntity.badRequest().build()
        } else {
            ResponseEntity.ok().body(TokenUtils.generateJwtToken(userService.signUp(user)))
        }
    }
    @GetMapping("/users")
    fun getALlUsers(): List<User> {
        return userService.getUserList()
    }
}
