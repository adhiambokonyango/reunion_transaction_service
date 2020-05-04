package com.silasonyango.transactionservice.controllers.great_grand_parents_siblings;

import com.silasonyango.transactionservice.repository.great_grand_parents_siblings.GGGGrParentsSiblingsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ggggrparentssiblings")
public class GGGGrParentsSiblingsController {
    GGGGrParentsSiblingsRepository ggggrParentsSiblingsRepository;
}
