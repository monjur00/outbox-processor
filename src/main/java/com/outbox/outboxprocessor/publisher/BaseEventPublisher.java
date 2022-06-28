package com.outbox.outboxprocessor.publisher;

import com.outbox.outboxprocessor.model.OutboxEvent;

@FunctionalInterface
public interface BaseEventPublisher {

    void publish(final OutboxEvent event);
}
