package com.example.roomservicemangment.Controler;

import com.example.roomservicemangment.Model.Myorder;
import com.example.roomservicemangment.Model.Users;
import com.example.roomservicemangment.Service.Myorderservice;
import com.example.roomservicemangment.dto.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/order")
public class MyorderController {
    public final Myorderservice myorderservice;
    @GetMapping
    public ResponseEntity <List> getorder(){
      List <Myorder> myorders=myorderservice.getorder();
      return ResponseEntity.status(200).body(myorders);
    }
    @PostMapping
    public ResponseEntity  addorder(@RequestBody Myorder myorder, @AuthenticationPrincipal Users users){
        myorderservice.addorder(myorder,users);
        return ResponseEntity.status(200).body(new Api("ORDER ADDED !",200));
    }
    @PutMapping("/{id}")
    public ResponseEntity updetorder(@RequestBody Myorder myorder,@PathVariable Integer id){
        myorderservice.updateorder(myorder,id);
        return ResponseEntity.status(200).body(new Api("ORDER UPDATED !",200));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteorder(@PathVariable Integer id){
        myorderservice.deleteorder(id);
        return ResponseEntity.status(200).body(new Api("ORDER DELETED !",200));
    }




}
