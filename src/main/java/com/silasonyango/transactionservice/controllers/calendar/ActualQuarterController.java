package com.silasonyango.transactionservice.controllers.calendar;


import com.silasonyango.transactionservice.repository.calendar.ActualQuarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actualquarter")
public class ActualQuarterController {
    @Autowired
    ActualQuarterRepository actualQuarterRepository;
}
