package com.example.roomservicemangment.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Myorder {
    @Id
   //@GeneratedValue(strategy = GenerationType.IDENTITY )
    private String serviceid;
    private String time;
    private Integer workerid;
    private Integer userid;

}
