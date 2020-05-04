package com.silasonyango.transactionservice.controllers.financial_management;

import com.silasonyango.transactionservice.repository.financial_management.ContributionReportUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contributionreportupdate")
public class ContributionReportUpdateController {
    @Autowired
    ContributionReportUpdateRepository contributionReportUpdateRepository;
}
