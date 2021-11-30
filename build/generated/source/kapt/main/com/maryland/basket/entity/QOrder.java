package com.maryland.basket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 310785840L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrder order = new QOrder("order1");

    public final QBasket basket;

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final QUser creator;

    public final DateTimePath<java.util.Date> deadline = createDateTime("deadline", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> maxCount = createNumber("maxCount", Integer.class);

    public final NumberPath<Integer> minCount = createNumber("minCount", Integer.class);

    public final ComparablePath<Enum<OrderStatus>> status = createComparable("status", Enum.class);

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    public QOrder(Path<? extends Order> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrder(PathMetadata metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.basket = inits.isInitialized("basket") ? new QBasket(forProperty("basket")) : null;
        this.creator = inits.isInitialized("creator") ? new QUser(forProperty("creator")) : null;
    }

}

