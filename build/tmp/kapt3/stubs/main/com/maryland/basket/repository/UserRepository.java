package com.maryland.basket.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/maryland/basket/repository/UserRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/maryland/basket/entity/User;", "", "Lcom/maryland/basket/repository/UserCustomRepository;", "Lorg/springframework/data/querydsl/QuerydslPredicateExecutor;", "basket"})
public abstract interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<com.maryland.basket.entity.User, java.lang.Long>, com.maryland.basket.repository.UserCustomRepository, org.springframework.data.querydsl.QuerydslPredicateExecutor<com.maryland.basket.entity.User> {
}