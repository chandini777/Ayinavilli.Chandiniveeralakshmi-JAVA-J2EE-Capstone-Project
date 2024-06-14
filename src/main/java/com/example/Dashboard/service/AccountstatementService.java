package com.example.Dashboard.service;

import com.example.Dashboard.model.User;
import org.springframework.stereotype.Service;


public class AccountstatementService {

    @Service
    public class UserService {

        public User getUserDetails() {
            return new User();
        }
        public User updateUserDetails(User updatedUser){
            return new User();
        }
    }

}
