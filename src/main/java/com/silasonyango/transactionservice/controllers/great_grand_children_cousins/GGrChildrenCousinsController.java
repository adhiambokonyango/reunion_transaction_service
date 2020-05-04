package com.silasonyango.transactionservice.controllers.great_grand_children_cousins;

import com.silasonyango.transactionservice.repository.great_grand_children_cousins.GGrChildrenCousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ggrchildrencousins")
public class GGrChildrenCousinsController {
    GGrChildrenCousinsRepository ggrChildrenCousinsRepository;
}

