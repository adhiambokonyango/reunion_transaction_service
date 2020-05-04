package com.silasonyango.transactionservice.controllers.great_grand_parents_siblings;

import com.silasonyango.transactionservice.repository.great_grand_parents_siblings.GrParentsSiblingsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grparentssiblings")

public class GrParentsSiblingsController {
    GrParentsSiblingsRepository grParentsSiblingsRepository;
}
