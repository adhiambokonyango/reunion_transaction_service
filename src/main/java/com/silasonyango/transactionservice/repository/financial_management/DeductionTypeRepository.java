package com.silasonyango.transactionservice.repository.financial_management;

import com.silasonyango.transactionservice.entity_classes.financial_management.DeductionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeductionTypeRepository extends JpaRepository<DeductionTypeEntity, Long> {
}
