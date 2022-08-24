package com.example.roomservicemangment.Service;

import com.example.roomservicemangment.Model.Worker;
import com.example.roomservicemangment.Repositers.WorkerRepositers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class Workerservice {

 public final WorkerRepositers workerRepositers;



 public List<Worker> getworker() {
  return workerRepositers.findAll();
 }
 public  void addworker(Worker worker) {
  workerRepositers.save(worker);
 }

 public void updeteworker(Worker worker,Integer id) {
  Worker oldworker=workerRepositers.findWorkerById(id);
  oldworker.setFullName(worker.getFullName());
  oldworker.setSkills(worker.getSkills());
  oldworker.setText(worker.getText());
  workerRepositers.save(worker);
 }
 public void deleteworker(Integer id) {
  Worker myworker= workerRepositers.getById(id);
  workerRepositers.delete(myworker);
 }

}



