package com.silasonyango.transactionservice.controllers.time;

import com.silasonyango.transactionservice.repository.time.MonthsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthsController {
    MonthsRepository monthsRepository;
}
