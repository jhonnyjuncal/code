package com.jhonny.code.infrastructure.converter;

import com.jhonny.code.application.model.User;
import com.jhonny.code.infrastructure.dto.UserDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserConverter {

    UserDTO mapToDTO(User user);
    User mapFromDTO(UserDTO userDTO);
    List<UserDTO> mapListDTOFromList(List<User> userList);
    List<User> mapListFromListDTO(List<UserDTO> userDTOS);
}
