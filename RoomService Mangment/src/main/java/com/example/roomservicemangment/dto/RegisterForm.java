package com.example.roomservicemangment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class RegisterForm {
    @NotEmpty(message ="Username can't be empty!")
    private String username;
    @NotEmpty(message = "Password can't be empty!")
    private String password;
    private String role;
    private String text;
    private String skills;
    private String fullName;
    private Integer age;
    private String location;
    private String PhoneNumber;
}
