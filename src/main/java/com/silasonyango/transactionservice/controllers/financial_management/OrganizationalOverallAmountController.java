package com.silasonyango.transactionservice.controllers.financial_management;

import com.silasonyango.transactionservice.repository.financial_management.OrganizationalOverallAmountRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizationaloverallamount")
public class OrganizationalOverallAmountController {
    OrganizationalOverallAmountRepository organizationalOverallAmountRepository;
}
