package com.jhonny.code.infrastructure.repository;

import com.jhonny.code.infrastructure.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends CrudRepository<UserDTO, Integer> {

}
