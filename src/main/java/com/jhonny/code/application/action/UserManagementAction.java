package com.jhonny.code.application.action;

import com.jhonny.code.application.model.User;
import com.jhonny.code.application.service.UserService;
import com.jhonny.code.infrastructure.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
@RequestScope
public class UserManagementAction implements Serializable {

    @Autowired
    private UserService userService;

    @Autowired
    private User userForm;


    public void persistNewUser() {
        System.out.println("////////////////////////////////////////////");
        System.out.println("Email: " + userForm.getEmail());
        System.out.println("Name: " + userForm.getName());
        System.out.println("Last name: " + userForm.getLastName());
        System.out.println("Birth date: " + userForm.getBirthDate());
        System.out.println("////////////////////////////////////////////");
        if (validateFormData(userForm)) {
            userService.saveNewUser(userForm);
        }
    }

    public List<UserDTO> loadUsers() {
        return userService.loadAllUsers();
    }

    private boolean validateFormData(User userForm) {
        if (userForm.getEmail() == null || userForm.getEmail().isEmpty() || !validEmail(userForm.getEmail())) {
            FacesContext.getCurrentInstance().addMessage("user-form:emailField", new FacesMessage("Email is not valid"));
            return false;
        } else if (userForm.getName() == null || userForm.getName().isEmpty() || !validateNames(userForm.getName())) {
            FacesContext.getCurrentInstance().addMessage("user-form:nameField", new FacesMessage("Name is not valid"));
            return false;
        } else if (userForm.getLastName() == null || userForm.getLastName().isEmpty() || !validateNames(userForm.getLastName())) {
            FacesContext.getCurrentInstance().addMessage("user-form:lastNameField", new FacesMessage("Last name is not valid"));
            return false;
        }
        return true;
    }

    private boolean validEmail(String email) {
        String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(pattern);
    }

    private boolean validateNames(String name) {
        String pattern = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        return name.matches(pattern);
    }
}
