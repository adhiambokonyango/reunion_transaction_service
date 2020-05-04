package com.silasonyango.transactionservice.controllers.siblings;

import com.silasonyango.transactionservice.repository.siblings.SiblingsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siblings")
public class SiblingsController {
    SiblingsRepository siblingsRepository;
}
