package com.maryland.basket.repository.userBasket

import com.maryland.basket.entity.UserBasket
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository

@Repository
interface UserBasketRepository : JpaRepository<UserBasket, Long>, QuerydslPredicateExecutor<UserBasket>
