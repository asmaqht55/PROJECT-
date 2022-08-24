package com.example.roomservicemangment.Service;

import com.example.roomservicemangment.Repositers.custmerRepositers;
import com.example.roomservicemangment.Model.Custmer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class custmerservice {
   private final custmerRepositers custmerRepositers;

   public List<Custmer> getcustmer() {
      return custmerRepositers.findAll();
   }
   public void addwcustmer(Custmer custmer) {
      custmerRepositers.save(custmer);
   }
   public void updetecustmer(Custmer custmer,Integer id) {
      Custmer oldcustmer=custmerRepositers.findCustmerById(id);
      oldcustmer.setFullName(custmer.getFullName());
      oldcustmer.setAge(custmer.getAge());
      oldcustmer.setLocation(custmer.getLocation());
      oldcustmer.setPhoneNumber(custmer.getPhoneNumber());
      custmerRepositers.save(custmer);
   }
   public void deletecustmer(Integer ID) {
      Custmer mycustmer= custmerRepositers.getById(ID);
      custmerRepositers.delete(mycustmer);
   }

}
