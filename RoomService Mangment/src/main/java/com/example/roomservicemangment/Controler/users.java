package com.example.roomservicemangment.Controler;

import com.example.roomservicemangment.dto.LoginForm;
import com.example.roomservicemangment.dto.RegisterForm;
import com.example.roomservicemangment.dto.Api;
import com.example.roomservicemangment.Service.userservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class users {
    private final userservice Userservice;


    @PostMapping({"/register"})
    public ResponseEntity register(@RequestBody RegisterForm registerForm){
        Userservice.register(registerForm);
        return ResponseEntity.status(200).body(new Api("New Users added !",200));
    }


    @PostMapping ("/login")
    public ResponseEntity login (){
        return ResponseEntity.status(200).body(new Api("Welcome Back !",200));
    }


}
