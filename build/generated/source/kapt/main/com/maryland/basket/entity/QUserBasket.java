package com.maryland.basket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserBasket is a Querydsl query type for UserBasket
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserBasket extends EntityPathBase<UserBasket> {

    private static final long serialVersionUID = -689947953L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserBasket userBasket = new QUserBasket("userBasket");

    public final QBasket basket;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUser user;

    public QUserBasket(String variable) {
        this(UserBasket.class, forVariable(variable), INITS);
    }

    public QUserBasket(Path<? extends UserBasket> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserBasket(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserBasket(PathMetadata metadata, PathInits inits) {
        this(UserBasket.class, metadata, inits);
    }

    public QUserBasket(Class<? extends UserBasket> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.basket = inits.isInitialized("basket") ? new QBasket(forProperty("basket")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

