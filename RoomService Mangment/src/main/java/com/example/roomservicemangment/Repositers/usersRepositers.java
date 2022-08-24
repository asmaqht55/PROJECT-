package com.example.roomservicemangment.Repositers;

import com.example.roomservicemangment.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepositers extends JpaRepository<Users,Integer> {
    Users findUsersByUsername( String username);

}
