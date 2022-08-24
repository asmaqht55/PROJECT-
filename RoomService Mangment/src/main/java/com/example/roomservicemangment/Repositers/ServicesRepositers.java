package com.example.roomservicemangment.Repositers;

import com.example.roomservicemangment.Model.Service1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepositers extends JpaRepository<Service1,Integer> {
    Service1 findService1ById(Integer id);

}
