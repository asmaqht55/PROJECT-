package com.example.roomservicemangment.Service;

import com.example.roomservicemangment.Model.Service1;
import com.example.roomservicemangment.Model.Users;
import com.example.roomservicemangment.Repositers.ServicesRepositers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Serviices {

   public final ServicesRepositers servicesRepositers;


    public List<Service1> getServices() {
        return servicesRepositers.findAll();
    }

    public void addServices(Service1 service1, Users users)throws Exception{
        service1.setUserid(users.getId());
        servicesRepositers.save(service1);
    }
    public void updeteServices(Service1 service1 , Integer id) {
        Service1 servicee=servicesRepositers.findService1ById(id);
        servicee.setNameOfServies(service1.getNameOfServies());
         servicee.setDeseription(service1.getNameOfServies());
         service1.setPrice(service1.getPrice());
        servicesRepositers.save(servicee);
    }

    public void deleteServices(Integer id) {
        Service1 service= servicesRepositers.getById(id);
        servicesRepositers.delete(service);
    }


}
