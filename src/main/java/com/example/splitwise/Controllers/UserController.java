package com.example.splitwise.Controllers;

import com.example.splitwise.Dtos.Transaction;
import com.example.splitwise.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userService;


    public List<Transaction> settleUpGroup(Long groupId){
        return userService.settleUpGroup(groupId);
    }
}
