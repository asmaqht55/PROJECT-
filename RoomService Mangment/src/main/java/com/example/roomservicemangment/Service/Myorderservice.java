package com.example.roomservicemangment.Service;

import com.example.roomservicemangment.Model.Myorder;
import com.example.roomservicemangment.Model.Users;
import com.example.roomservicemangment.Repositers.MyorderRepositers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Myorderservice {
    private final MyorderRepositers myorderRepositers;

    public List<Myorder> getorder(){
        return myorderRepositers.findAll();
    }
    public void addorder(Myorder myorder, Users users){
        myorder.setUserid(users.getId());
        myorderRepositers.save(myorder);
    }
     //point for my order
    public void updateorder(Myorder myorder,Integer id){
        Myorder oldOrder=myorderRepositers.findMyorderByUserid(id);
        oldOrder.setServiceid(myorder.getServiceid());
        myorderRepositers.save(oldOrder);
    }

    public void deleteorder(Integer id){
        Myorder myorder=myorderRepositers.getById(id);
        myorderRepositers.delete(myorder);
    }





}
