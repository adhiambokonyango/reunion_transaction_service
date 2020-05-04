package com.silasonyango.transactionservice.controllers.time;

import com.silasonyango.transactionservice.repository.time.MonthsIterationsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monthsiterations")
public class MonthsIterationsController {
    MonthsIterationsRepository monthsIterationsRepository;
}
