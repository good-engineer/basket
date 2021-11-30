package com.maryland.basket.repository

import com.maryland.basket.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor

interface UserRepository : JpaRepository<User, Long>, UserCustomRepository, QuerydslPredicateExecutor<User>
