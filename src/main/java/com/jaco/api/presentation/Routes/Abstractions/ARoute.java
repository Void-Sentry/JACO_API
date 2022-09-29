package com.jaco.api.presentation.Routes.Abstractions;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jaco.api.domain.Models.Abstractions.AEntity;

public interface ARoute<E extends AEntity> {
    
    @GetMapping
    public List<E> index();
    
    @GetMapping(path = { "/{id}" })
    public Optional<E> show(@PathVariable UUID id);
    
    @PostMapping
    public void store(@RequestBody E entity);

    @PutMapping
    public void edit(@RequestBody E entity);

    @DeleteMapping(path = { "/{id}" })
    public void destroy(@PathVariable UUID id);
}
