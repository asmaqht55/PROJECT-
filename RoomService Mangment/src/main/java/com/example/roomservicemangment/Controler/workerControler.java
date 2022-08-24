package com.example.roomservicemangment.Controler;

import com.example.roomservicemangment.dto.Api;
import com.example.roomservicemangment.Model.Worker;
import com.example.roomservicemangment.Service.Workerservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("abi/v1/admin")
@RequiredArgsConstructor
public class workerControler {
    private final Workerservice workerservice;

@GetMapping("/worker")
    public ResponseEntity <List> getwoker() {
       List <Worker> workers=workerservice.getworker();
    return ResponseEntity.status(201).body(workers);
    }

    @PostMapping("/worker")
    public ResponseEntity addworker(@RequestBody @Valid Worker worker){
            workerservice.addworker(worker);
            return ResponseEntity.status(200).body(new Api("Worker added !",200));
        }

    @PutMapping("/{id}")
    public ResponseEntity Updateworker(@RequestBody @Valid Worker worker, @PathVariable Integer id){
        workerservice.updeteworker(worker, id);
        return ResponseEntity.status(200).body(new Api("Worker updated !",200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteworker(@PathVariable Integer id){
        workerservice.deleteworker(id);
        return ResponseEntity.status(200).body(new Api("Worker deleted !",200));
    }


}




