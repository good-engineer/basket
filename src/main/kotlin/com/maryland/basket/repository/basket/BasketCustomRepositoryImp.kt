package com.maryland.basket.repository.basket

import com.maryland.basket.entity.Basket
import com.maryland.basket.entity.QBasket
import com.maryland.basket.entity.QUser
import com.maryland.basket.entity.QUserBasket
import com.querydsl.jpa.impl.JPAQueryFactory
import javax.persistence.EntityManager

class BasketCustomRepositoryImp
(private val entityManager: EntityManager) :
    BasketCustomRepository {
    private val queryFactory: JPAQueryFactory = JPAQueryFactory(entityManager)

    override fun findBasketsByUserId(id: Long): MutableList<Basket> {
        return queryFactory.selectFrom(QBasket.basket)
            .innerJoin(QBasket.basket, QUserBasket.userBasket.basket).on(QBasket.basket.id.eq(QUserBasket.userBasket.basket.id))
            .innerJoin(QUser.user).on(QUser.user.id.eq(QUserBasket.userBasket.user.id))
            .where(QUser.user.id.eq(id)).fetch()
    }
//    override fun findUsersByBasketId(id: Long): MutableList<User> {
//        return queryFactory.selectFrom(QUser.user).innerJoin(QUserBasket.userBasket.user, QUser.user).where(QUserBasket.userBasket.basket.id.eq(id)).fetch()
//    }
}
