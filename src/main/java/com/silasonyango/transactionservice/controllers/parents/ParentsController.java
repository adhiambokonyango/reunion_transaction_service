package com.silasonyango.transactionservice.controllers.parents;

import com.silasonyango.transactionservice.repository.parents.ParentsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parents")
public class ParentsController {
    ParentsRepository parentsRepository;
}
