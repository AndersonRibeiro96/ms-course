package com.dev.hruser.services;

import com.dev.hruser.domain.User;
import com.dev.hruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User findById(Long id){
        return userRepository.findById(id).get();
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email).get();
    }


}
