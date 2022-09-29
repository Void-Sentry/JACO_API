package com.jaco.api.infrastructure.Services.Abstractions;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.scheduling.annotation.Async;

import com.jaco.api.domain.Models.Abstractions.AEntity;
import com.jaco.api.infrastructure.Repositories.Abstractions.IRepository;

public abstract class AService<E extends AEntity, R extends IRepository<E>> implements IService<E> {
    
    protected final E _entity;
    protected final R _repository;

    public AService(E entity, R repository) {
        this._entity = entity;
        this._repository = repository;
    }

    @Override
    public List<E> index() {
        return this._repository.findAll();
    }

    @Override
    public Optional<E> show(UUID id) {
        return this._repository.findById(id);
    }

    @Async
    @Override
    public void store(E entity) {
        this._repository.save(entity);
    }

    @Async
    @Override
    public void edit(E entity) {
        this._repository.saveAndFlush(entity);
    }

    @Async
    @Override
    public void destroy(UUID id) {
        this._repository.deleteById(id);
    }
}
