package com.maryland.basket.repository.basket

import com.maryland.basket.entity.Basket
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository

@Repository
interface BasketRepository : JpaRepository<Basket, Long>, BasketCustomRepository, QuerydslPredicateExecutor<Basket>
