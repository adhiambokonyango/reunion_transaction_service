package com.silasonyango.transactionservice.controllers.cousins;

import com.silasonyango.transactionservice.repository.cousins.CousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cousins")
public class CousinsController {
    CousinsRepository cousinsRepository;
}
