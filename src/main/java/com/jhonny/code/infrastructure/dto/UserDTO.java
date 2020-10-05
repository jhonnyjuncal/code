package com.jhonny.code.infrastructure.dto;

import lombok.Getter;
import lombok.Setter;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;


@Entity
@Getter
@Setter
public class UserDTO {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="birth_date")
    private Date birthDate;
}
