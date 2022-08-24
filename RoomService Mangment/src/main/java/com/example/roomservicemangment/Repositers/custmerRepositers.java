package com.example.roomservicemangment.Repositers;

import com.example.roomservicemangment.Model.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface custmerRepositers extends JpaRepository<Custmer,Integer> {
Custmer findCustmerById(Integer id);

}


