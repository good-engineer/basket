package com.maryland.basket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInvoice is a Querydsl query type for Invoice
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInvoice extends EntityPathBase<Invoice> {

    private static final long serialVersionUID = 1184793231L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInvoice invoice = new QInvoice("invoice");

    public final NumberPath<Long> amount = createNumber("amount", Long.class);

    public final DateTimePath<java.util.Date> completedAt = createDateTime("completedAt", java.util.Date.class);

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final QUser from;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrder order;

    public final EnumPath<InvoiceStatus> status = createEnum("status", InvoiceStatus.class);

    public final QUser to;

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QInvoice(String variable) {
        this(Invoice.class, forVariable(variable), INITS);
    }

    public QInvoice(Path<? extends Invoice> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInvoice(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInvoice(PathMetadata metadata, PathInits inits) {
        this(Invoice.class, metadata, inits);
    }

    public QInvoice(Class<? extends Invoice> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.from = inits.isInitialized("from") ? new QUser(forProperty("from")) : null;
        this.order = inits.isInitialized("order") ? new QOrder(forProperty("order"), inits.get("order")) : null;
        this.to = inits.isInitialized("to") ? new QUser(forProperty("to")) : null;
    }

}

