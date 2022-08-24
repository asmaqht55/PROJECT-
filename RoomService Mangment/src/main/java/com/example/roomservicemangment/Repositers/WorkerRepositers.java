package com.example.roomservicemangment.Repositers;

import com.example.roomservicemangment.Model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepositers extends JpaRepository<Worker,Integer> {
 Worker findWorkerById(Integer id);
}