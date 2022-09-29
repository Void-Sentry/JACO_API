package com.jaco.api.application.Controllers;

import com.jaco.api.application.Controllers.Abstractions.AController;
import com.jaco.api.infrastructure.Services.User.IUser;
import com.jaco.api.domain.Models.User.User;

public class CUser extends AController<User, IUser>{
    public CUser(User entity, IUser service) {
        super(entity, service);
    }
}
