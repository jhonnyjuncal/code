package com.jhonny.code.application.model;

import lombok.Getter;
import lombok.Setter;

import javax.inject.Named;
import java.io.Serializable;


@Named
@Getter
@Setter
public class User implements Serializable {

    private String name;
    private String lastName;
    private String email;
    private String birthDate;
}
