package com.silasonyango.transactionservice.controllers.great_grand_parents;

import com.silasonyango.transactionservice.repository.great_grand_parents.GGrParentsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ggrparents")
public class GGrParentsController {
    GGrParentsRepository ggrParentsRepository;
}
