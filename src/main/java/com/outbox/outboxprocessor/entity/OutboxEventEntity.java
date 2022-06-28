package com.outbox.outboxprocessor.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class OutboxEventEntity {

    @Id
    private UUID eventId;

    @Column
    private String eventAggregateName;

    @Column
    private LocalDateTime createdTime;

    @Column
    private LocalDateTime updatedTime;

    @OneToMany
    private List<OutboxEventAttributeEntity> eventAttributes;

}
