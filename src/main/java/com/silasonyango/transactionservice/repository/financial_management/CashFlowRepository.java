package com.silasonyango.transactionservice.repository.financial_management;


import com.silasonyango.transactionservice.entity_classes.financial_management.CashFlowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashFlowRepository extends JpaRepository<CashFlowEntity, Long> {
}
