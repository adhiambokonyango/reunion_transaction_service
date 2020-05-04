package com.silasonyango.transactionservice.controllers.time;

import com.silasonyango.transactionservice.repository.time.QuarterIterationRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quarteriteration")
public class QuarterIterationController {
    QuarterIterationRepository quarterIterationRepository;
}
