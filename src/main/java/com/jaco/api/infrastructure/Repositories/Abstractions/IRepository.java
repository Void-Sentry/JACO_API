package com.jaco.api.infrastructure.Repositories.Abstractions;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaco.api.domain.Models.Abstractions.AEntity;

public interface IRepository<M extends AEntity> extends JpaRepository<M, UUID>{
}
