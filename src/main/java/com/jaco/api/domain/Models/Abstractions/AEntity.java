package com.jaco.api.domain.Models.Abstractions;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;

@MappedSuperclass
public abstract class AEntity implements Serializable, IEntity {
    
    @Id
    @Column(name = "id")
    @Type(type = "uuid-char")
    private UUID _id = UUID.randomUUID();

    @Override
    public UUID get_id() {
        return this._id;
    }

    @Override
    public void set_id(UUID id) {
        this._id = id;
    }
}
