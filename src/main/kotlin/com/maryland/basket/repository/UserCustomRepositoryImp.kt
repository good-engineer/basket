package com.maryland.basket.repository

import com.maryland.basket.entity.User
import com.querydsl.jpa.impl.JPAQueryFactory
import javax.persistence.EntityManager

class UserCustomRepositoryImp
(private val entityManager: EntityManager) : UserCustomRepository {
    private val queryFactory: JPAQueryFactory = JPAQueryFactory(entityManager)

    override fun getUserByEmail(email: String): User? {
        return queryFactory.selectFrom(QUser).where(email).fetchOne()
    }
}
