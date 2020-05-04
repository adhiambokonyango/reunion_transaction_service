package com.silasonyango.transactionservice.controllers.financial_management;

import com.silasonyango.transactionservice.repository.financial_management.UserContributionsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usercontributions")
public class UserContributionsController {
    UserContributionsRepository userContributionsRepository;
}
