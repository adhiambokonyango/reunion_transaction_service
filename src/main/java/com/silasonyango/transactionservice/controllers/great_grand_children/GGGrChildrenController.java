package com.silasonyango.transactionservice.controllers.great_grand_children;

import com.silasonyango.transactionservice.repository.great_grand_children.GGGrChildrenRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gggrchildren")
public class GGGrChildrenController {
    GGGrChildrenRepository gggrChildrenRepository;
}
