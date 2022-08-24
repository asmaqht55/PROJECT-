package com.example.roomservicemangment.Service;

import com.example.roomservicemangment.Model.Users;
import com.example.roomservicemangment.Repositers.usersRepositers;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {
    private final usersRepositers usersRepositerss;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users= usersRepositerss.findUsersByUsername(username);
        if(users==null){
            throw new UsernameNotFoundException("Invalid Username or Password");
        }
        return users;
    }
}
