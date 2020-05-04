package com.silasonyango.transactionservice.controllers.spouse;

import com.silasonyango.transactionservice.repository.siblings.SiblingsRepository;
import com.silasonyango.transactionservice.repository.spouse.SpouseRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spouse")
public class SpouseController {
    SpouseRepository spouseRepository;
}
