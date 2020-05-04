package com.silasonyango.transactionservice.controllers.financial_management;

import com.silasonyango.transactionservice.repository.financial_management.CashFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashflow")
public class CashFlowController {
    @Autowired
    CashFlowRepository cashFlowRepository;
}
