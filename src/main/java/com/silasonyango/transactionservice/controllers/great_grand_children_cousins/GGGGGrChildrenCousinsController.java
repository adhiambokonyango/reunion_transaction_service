package com.silasonyango.transactionservice.controllers.great_grand_children_cousins;

import com.silasonyango.transactionservice.repository.great_grand_children_cousins.GGGGGrChildrenCousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gggggrchildrencousins")
public class GGGGGrChildrenCousinsController {
    GGGGGrChildrenCousinsRepository gggggrChildrenCousinsRepository;
}
