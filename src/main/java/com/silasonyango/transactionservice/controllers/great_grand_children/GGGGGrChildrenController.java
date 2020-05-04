package com.silasonyango.transactionservice.controllers.great_grand_children;

import com.silasonyango.transactionservice.repository.great_grand_children.GGGGGrChildrenRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gggggrchildren")
public class GGGGGrChildrenController {
    GGGGGrChildrenRepository gggggrChildrenRepository;
}
