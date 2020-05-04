package com.silasonyango.transactionservice.repository.financial_management;

import com.silasonyango.transactionservice.entity_classes.financial_management.CashFlowTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashFlowTypesRepository extends JpaRepository<CashFlowTypesEntity, Long> {
}
