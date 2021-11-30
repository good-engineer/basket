package com.maryland.basket.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/maryland/basket/repository/UserCustomRepositoryImp;", "Lcom/maryland/basket/repository/UserCustomRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "(Ljavax/persistence/EntityManager;)V", "queryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "getUserByEmail", "Lcom/maryland/basket/entity/User;", "email", "", "basket"})
public final class UserCustomRepositoryImp implements com.maryland.basket.repository.UserCustomRepository {
    private final javax.persistence.EntityManager entityManager = null;
    private final com.querydsl.jpa.impl.JPAQueryFactory queryFactory = null;
    
    public UserCustomRepositoryImp(@org.jetbrains.annotations.NotNull
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.maryland.basket.entity.User getUserByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
}