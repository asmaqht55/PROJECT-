package com.example.roomservicemangment.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class  LoginForm {
    @NotEmpty(message = "Username Can't Be empty")
   private String username;
   @NotEmpty(message = "Password Can't Be empty")
    private String password;
}
