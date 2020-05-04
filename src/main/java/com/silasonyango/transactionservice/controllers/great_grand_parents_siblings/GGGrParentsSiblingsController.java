package com.silasonyango.transactionservice.controllers.great_grand_parents_siblings;

import com.silasonyango.transactionservice.repository.great_grand_parents_siblings.GGGrParentsSiblingsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gggrparentssiblings")
public class GGGrParentsSiblingsController {
    GGGrParentsSiblingsRepository gggrParentsSiblingsRepository;
}
