package com.jaco.api.infrastructure.Services.User;

import org.springframework.stereotype.Service;

import com.jaco.api.domain.Models.User.User;
import com.jaco.api.infrastructure.Repositories.RUser;
import com.jaco.api.infrastructure.Services.Abstractions.AService;

@Service
public class SUser extends AService<User, RUser> implements IUser {
    public SUser(User entity, RUser repo) {
        super(entity, repo);
    }
}
