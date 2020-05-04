package com.silasonyango.transactionservice.controllers.great_grand_parents;

import com.silasonyango.transactionservice.repository.great_grand_parents.GGGGrParentsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ggggrparents")
public class GGGGrParentsController {
    GGGGrParentsRepository ggggrParentsRepository;
}
