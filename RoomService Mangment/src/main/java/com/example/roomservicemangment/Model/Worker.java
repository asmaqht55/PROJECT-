package com.example.roomservicemangment.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Worker {
    //the worker it's admian in same time ,he is can add any services do it
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Cant be empty !")
    private String fullName;
    @NotEmpty(message = "Cant be empty !")
    private String text;
    @NotEmpty(message = "Cant be empty !")
    private String skills;
    private Integer userId;
}
