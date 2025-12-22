package org.sebas.cloudp.common;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

//All classes extend this one to avoid boilerplate
@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;


}
