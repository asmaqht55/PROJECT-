package com.example.roomservicemangment.Controler;

import com.example.roomservicemangment.Model.Service1;
import com.example.roomservicemangment.Model.Users;
import com.example.roomservicemangment.Service.Serviices;
import com.example.roomservicemangment.dto.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("abi/v1/ser")
@RequiredArgsConstructor
public class servicees {
    private final Serviices serviices;

    @GetMapping
    public ResponseEntity<List> getServices() {
        List <Service1> service1=serviices.getServices();
        return ResponseEntity.status(201).body(service1);
    }

    @PostMapping
    public ResponseEntity addServices(@RequestBody Service1 service1, @AuthenticationPrincipal Users users) throws Exception {
        serviices.addServices(service1,users);
        return ResponseEntity.status(200).body(new Api("Services added !",200));
    }

    @PutMapping("/{id}")
    public ResponseEntity UpdateServices(@RequestBody @Valid Service1 service1, @PathVariable Integer Price){
        serviices.updeteServices(service1,Price);
        return ResponseEntity.status(200).body(new Api("Services updated !",200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteServices(@PathVariable Integer Price){
        serviices.deleteServices(Price);
        return ResponseEntity.status(200).body(new Api("Services deleted !",200));
    }



}
