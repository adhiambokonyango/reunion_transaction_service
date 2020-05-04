package com.silasonyango.transactionservice.controllers.parents;

import com.silasonyango.transactionservice.repository.parents.ParentsCousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parentscousins")
public class ParentsCousinsController {
    ParentsCousinsRepository parentsCousinsRepository;
}
