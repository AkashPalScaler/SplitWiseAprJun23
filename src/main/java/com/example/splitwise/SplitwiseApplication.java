package com.example.splitwise;

import com.example.splitwise.Controllers.UserController;
import com.example.splitwise.Repositories.UserRepositories;

import com.example.splitwise.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {
	@Autowired
	public DataGenerator dataGenerator;
	@Autowired
	public UserRepositories userRepositories;
	@Autowired
	public UserController userController;
	public static void main(String[] args) {
		SpringApplication.run(SplitwiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		dataGenerator.generateData();
        userController.settleUpGroup(1l);
	}
}
