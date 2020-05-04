package com.silasonyango.transactionservice.repository.financial_management;

import com.silasonyango.transactionservice.entity_classes.financial_management.ActualDeductionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActualDeductionsRepository extends JpaRepository<ActualDeductionsEntity, Long> {
}
