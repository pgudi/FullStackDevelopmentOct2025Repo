package com.gentech.security.service;

import com.gentech.security.entity.MyUser;
import com.gentech.security.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private MyUserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> genericUser =repo.findByUserName(username);
        if(genericUser.isPresent()){
            MyUser specificUser =genericUser.get();
            return User.builder()
                    .username(specificUser.getUserName())
                    .password(specificUser.getPassword())
                    .roles(getRoles(specificUser))
                    .build();
        }else{
            throw new UsernameNotFoundException("The User has not found in the Database!!");
        }


    }

    public String[] getRoles(MyUser user){
        if(user.getRoles()==null){
            return new String[]{"USER"};
        }
        else{
            return user.getRoles().split(",");
        }
    }
}
