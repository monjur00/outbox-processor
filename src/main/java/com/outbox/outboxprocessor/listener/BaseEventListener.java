package com.outbox.outboxprocessor.listener;

import com.outbox.outboxprocessor.model.OutboxEvent;

@FunctionalInterface
public interface BaseEventListener {

    void onEvent(OutboxEvent event);

}
