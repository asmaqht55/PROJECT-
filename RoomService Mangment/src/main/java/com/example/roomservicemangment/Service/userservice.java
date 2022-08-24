package com.example.roomservicemangment.Service;

import com.example.roomservicemangment.Model.Custmer;
import com.example.roomservicemangment.dto.RegisterForm;
import com.example.roomservicemangment.Model.Users;
import com.example.roomservicemangment.Model.Worker;
import com.example.roomservicemangment.Repositers.WorkerRepositers;
import com.example.roomservicemangment.Repositers.custmerRepositers;
import com.example.roomservicemangment.Repositers.usersRepositers;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userservice {
    private final custmerRepositers custmerRepositerss;
    private final WorkerRepositers workerRepositers;
    private final usersRepositers usersRepositerss;

    public void register(RegisterForm registerForm) {
        String hashedPassword= new BCryptPasswordEncoder().encode(registerForm.getPassword());
        registerForm.setPassword(hashedPassword);
        Users users=new Users(null,registerForm.getUsername(),registerForm.getPassword(),registerForm.getRole());
         Users newUsers=usersRepositerss.save(users);
         if(registerForm.getRole().equals("Worker")){
             Worker worker=new Worker(null,registerForm.getFullName(),registerForm.getSkills(),registerForm.getText(),newUsers.getId());
              workerRepositers.save(worker);
         }else {
              Custmer custmer=new Custmer(null,registerForm.getFullName(),registerForm.getLocation(),registerForm.getAge(),registerForm.getPhoneNumber(),newUsers.getId());
              custmerRepositerss.save(custmer);
         }


    }

}
