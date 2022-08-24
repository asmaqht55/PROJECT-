package com.example.roomservicemangment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Orderform {
    private String fullName;
    private String location;
    private String yourService;
    private String day;
    private Integer price;
}

