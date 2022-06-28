package com.outbox.outboxprocessor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class OutboxEventAttributeEntity {

    @Id
    private UUID eventAttributeId;

    @Column
    private UUID eventId;

    @ManyToOne
    private OutboxEventEntity outboxEvent;

}
