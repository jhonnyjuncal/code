package com.jhonny.code.application.service;

import com.jhonny.code.application.model.User;
import com.jhonny.code.infrastructure.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO saveNewUser(User user);
    List<UserDTO> loadAllUsers();
}
