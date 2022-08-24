package com.example.roomservicemangment.Controler;

import com.example.roomservicemangment.dto.Api;
import com.example.roomservicemangment.Service.custmerservice;
import com.example.roomservicemangment.Model.Custmer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/custmer")
public class Custmercontroler {
    private final custmerservice custmerservicee;

    @GetMapping
    public ResponseEntity<List> getcustmer() {
        List <Custmer> mycustmer=custmerservicee.getcustmer();
        return ResponseEntity.status(201).body(mycustmer);
    }

    @PostMapping
    public ResponseEntity addcustmer(@RequestBody @Valid Custmer custmer){
        custmerservicee.addwcustmer(custmer);
        return ResponseEntity.status(200).body(new Api("Custmer added !",200));
    }
    @PutMapping("/{id}")
    public ResponseEntity updetecustmer(@RequestBody @Valid Custmer custmer, @PathVariable Integer ID){
        custmerservicee.updetecustmer(custmer, ID);
        return ResponseEntity.status(200).body(new Api("Custmer updated !",200));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletecustmer(@PathVariable Integer ID){
        custmerservicee.deletecustmer(ID);
        return ResponseEntity.status(200).body(new Api("Custmer deleted !",200));
    }



}
