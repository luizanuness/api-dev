package me.dio.domain.service;

import me.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User crate(User userToCreate);

}
