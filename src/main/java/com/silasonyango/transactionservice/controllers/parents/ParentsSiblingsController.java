package com.silasonyango.transactionservice.controllers.parents;

import com.silasonyango.transactionservice.repository.parents.ParentsSiblingsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parentsiblings")
public class ParentsSiblingsController {
    ParentsSiblingsRepository parentsSiblingsRepository;
}
