package com.jaco.api.application.Controllers.Abstractions;

import com.jaco.api.infrastructure.Services.Abstractions.IService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.jaco.api.domain.Models.Abstractions.AEntity;

public class AController<E extends AEntity, S extends IService<E>> implements IController<E> {
    protected final S _service;
    protected final E _entity;

    public AController(E entity, S service) {
        this._entity = entity;
        this._service = service;
    }

    @Override
    public List<E> index() {
        return this._service.index();
    }

    @Override
    public Optional<E> show(UUID id) {
        return this._service.show(id);
    }

    @Override
    public void store(E entity) {
        this._service.store(entity);
    }

    @Override
    public void edit(E entity) {
        this._service.edit(entity);
    }

    @Override
    public void destroy(UUID id) {
        this._service.destroy(id);
    }
}
