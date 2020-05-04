package com.silasonyango.transactionservice.controllers.great_grand_children_cousins;

import com.silasonyango.transactionservice.repository.great_grand_children_cousins.GGGrChildrenCousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gggrchildrencousins")
public class GGGrChildrenCousinsController {
    GGGrChildrenCousinsRepository gggrChildrenCousinsRepository;
}
