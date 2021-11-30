package com.maryland.basket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBasket is a Querydsl query type for Basket
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBasket extends EntityPathBase<Basket> {

    private static final long serialVersionUID = 656999972L;

    public static final QBasket basket = new QBasket("basket");

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QBasket(String variable) {
        super(Basket.class, forVariable(variable));
    }

    public QBasket(Path<? extends Basket> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBasket(PathMetadata metadata) {
        super(Basket.class, metadata);
    }

}

