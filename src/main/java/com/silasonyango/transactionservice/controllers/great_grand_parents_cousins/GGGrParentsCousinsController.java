package com.silasonyango.transactionservice.controllers.great_grand_parents_cousins;

import com.silasonyango.transactionservice.repository.great_grand_children_cousins.GGGrChildrenCousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gggrparentscousins")
public class GGGrParentsCousinsController {
    GGGrChildrenCousinsRepository gggrChildrenCousinsRepository;
}
