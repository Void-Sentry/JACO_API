package com.jaco.api.domain.Models.Abstractions;

import java.util.UUID;

public interface IEntity {
    public UUID get_id();
    public void set_id(UUID id);
}
