package com.maryland.basket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBasketProduct is a Querydsl query type for BasketProduct
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBasketProduct extends EntityPathBase<BasketProduct> {

    private static final long serialVersionUID = 1546972715L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBasketProduct basketProduct = new QBasketProduct("basketProduct");

    public final QBasket basket;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QProduct product;

    public QBasketProduct(String variable) {
        this(BasketProduct.class, forVariable(variable), INITS);
    }

    public QBasketProduct(Path<? extends BasketProduct> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBasketProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBasketProduct(PathMetadata metadata, PathInits inits) {
        this(BasketProduct.class, metadata, inits);
    }

    public QBasketProduct(Class<? extends BasketProduct> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.basket = inits.isInitialized("basket") ? new QBasket(forProperty("basket")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
    }

}

