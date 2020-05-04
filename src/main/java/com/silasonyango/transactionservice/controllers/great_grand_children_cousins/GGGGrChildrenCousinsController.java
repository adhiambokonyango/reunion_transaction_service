package com.silasonyango.transactionservice.controllers.great_grand_children_cousins;

import com.silasonyango.transactionservice.repository.great_grand_children_cousins.GGGGrChildrenCousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ggggrchildrencousins")
public class GGGGrChildrenCousinsController {
    GGGGrChildrenCousinsRepository ggggrChildrenCousinsRepository;
}
