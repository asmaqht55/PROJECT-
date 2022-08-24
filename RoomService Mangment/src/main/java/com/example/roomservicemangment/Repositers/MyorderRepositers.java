package com.example.roomservicemangment.Repositers;

import com.example.roomservicemangment.Model.Myorder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyorderRepositers extends JpaRepository<Myorder,Integer> {
    Myorder findMyorderByUserid (Integer number);
}
