package com.jhonny.code.application.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;
import java.sql.Date;

@Component
@SessionScope
@Getter
@Setter
public class User implements Serializable {

    private String name;
    private String lastName;
    private String email;
    private Date birthDate;
}
