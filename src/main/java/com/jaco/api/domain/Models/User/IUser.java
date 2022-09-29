package com.jaco.api.domain.Models.User;

import com.jaco.api.domain.Models.Abstractions.IEntity;

public interface IUser extends IEntity {
    public String get_name();
    public void set_name(String name);
    public Integer get_age();
    public void set_age(Integer age);
    public String get_email();
    public void set_email(String email);
}
