package com.jhonny.code.application.action;

import com.jhonny.code.application.model.User;
import com.jhonny.code.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serializable;

@Component
@RequestScope
public class UserManagementAction implements Serializable {

    @Autowired
    private UserService userService;

    @Autowired
    private User userForm;


    public void persistNewUser() {
        userService.saveNewUser(new User());
    }
}
