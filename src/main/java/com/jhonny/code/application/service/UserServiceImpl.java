package com.jhonny.code.application.service;

import com.jhonny.code.application.model.User;
import com.jhonny.code.infrastructure.converter.UserConverter;
import com.jhonny.code.infrastructure.dto.UserDTO;
import com.jhonny.code.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDTO saveNewUser(User user) {
        return userRepository.save(convertUser(user));
    }

    @Override
    public List<UserDTO> loadAllUsers() {
        List<UserDTO> list = new ArrayList<>();
        userRepository.findAll().forEach((dto -> list.add(dto)));
        return list;
    }

    private UserDTO convertUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setLastName(user.getLastName());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }
}
