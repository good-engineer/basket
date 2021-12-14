package com.maryland.basket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderRecord is a Querydsl query type for OrderRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderRecord extends EntityPathBase<OrderRecord> {

    private static final long serialVersionUID = -1986565215L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderRecord orderRecord = new QOrderRecord("orderRecord");

    public final QBasket basket;

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final QUser creator;

    public final DateTimePath<java.util.Date> deadline = createDateTime("deadline", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> maxCount = createNumber("maxCount", Integer.class);

    public final NumberPath<Integer> minCount = createNumber("minCount", Integer.class);

    public final EnumPath<OrderStatus> status = createEnum("status", OrderStatus.class);

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QOrderRecord(String variable) {
        this(OrderRecord.class, forVariable(variable), INITS);
    }

    public QOrderRecord(Path<? extends OrderRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderRecord(PathMetadata metadata, PathInits inits) {
        this(OrderRecord.class, metadata, inits);
    }

    public QOrderRecord(Class<? extends OrderRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.basket = inits.isInitialized("basket") ? new QBasket(forProperty("basket")) : null;
        this.creator = inits.isInitialized("creator") ? new QUser(forProperty("creator")) : null;
    }

}

