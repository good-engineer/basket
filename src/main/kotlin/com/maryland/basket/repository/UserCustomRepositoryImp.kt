package com.maryland.basket.repository

import com.maryland.basket.entity.QUser
import com.maryland.basket.entity.User
import com.querydsl.jpa.impl.JPAQueryFactory
import javax.persistence.EntityManager

class UserCustomRepositoryImp
(private val entityManager: EntityManager) : UserCustomRepository {
    private val queryFactory: JPAQueryFactory = JPAQueryFactory(entityManager)

    override fun findUserByEmail(email: String?): User? {
        return queryFactory.selectFrom(QUser.user).where(QUser.user.email.eq(email)).fetchOne()
    }
}
