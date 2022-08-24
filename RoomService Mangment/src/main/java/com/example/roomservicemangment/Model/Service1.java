package com.example.roomservicemangment.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Service1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Can't be empty !")
    private String nameOfServies;
    @NotEmpty(message = "Can't be empty !")
    private String deseription;
    @NotNull(message = "Can't be empty !")
    private Integer price;

    private Integer userid;
}
