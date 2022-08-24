package com.example.roomservicemangment.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Custmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition ="varchar (30)")
    private String fullName;
    private String location;
    @Range(min = 18,max =60,message = "You are child !")
    private Integer age;
    private String phoneNumber;
     private  Integer userId;
}
