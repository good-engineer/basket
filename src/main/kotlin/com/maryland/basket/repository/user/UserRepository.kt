package com.maryland.basket.repository.user

import com.maryland.basket.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>, UserCustomRepository, QuerydslPredicateExecutor<User>
