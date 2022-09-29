package com.jaco.api.presentation.Routes;

import org.springframework.web.bind.annotation.RestController;

import com.jaco.api.domain.Models.User.User;
import com.jaco.api.presentation.Routes.Abstractions.ARoute;

@RestController
public interface RUser extends ARoute<User> {
}
