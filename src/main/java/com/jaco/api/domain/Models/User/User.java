package com.jaco.api.domain.Models.User;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jaco.api.domain.Models.Abstractions.AEntity;

@Entity
@Table(name = "usuario")
public class User extends AEntity implements IUser {

    private String _name;
    private Integer _age;
    private String _email;

    public User(String name, Integer age, String email) {
        this._name  = name;
        this._age   = age;
        this._email = email;
    }

    @Override
    public String get_name() {
        return this._name;
    }

    @Override
    public void set_name(String name) {
        this._name = name;
    }

    @Override
    public Integer get_age() {
        return this._age;
    }

    @Override
    public void set_age(Integer age) {
        this._age = age;
    }

    @Override
    public String get_email() {
        return this._email;
    }

    @Override
    public void set_email(String email) {
        this._email = email;
    }
}
