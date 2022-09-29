package com.jaco.api.infrastructure.Services.Abstractions;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.jaco.api.domain.Models.Abstractions.AEntity;

public interface IService<E extends AEntity> {
    public List<E> index();
    public Optional<E> show(UUID id);
    public void store(E entity);
    public void edit(E entity);
    public void destroy(UUID id);
}
