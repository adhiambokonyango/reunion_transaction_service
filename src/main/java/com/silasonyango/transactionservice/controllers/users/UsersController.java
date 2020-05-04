package com.silasonyango.transactionservice.controllers.users;

import com.silasonyango.transactionservice.repository.user_management.UsersRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    UsersRepository usersRepository;
}
