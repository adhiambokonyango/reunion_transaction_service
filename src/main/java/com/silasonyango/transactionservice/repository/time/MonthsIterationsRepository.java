package com.silasonyango.transactionservice.repository.time;

import com.silasonyango.transactionservice.entity_classes.time.MonthsIterationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthsIterationsRepository extends JpaRepository<MonthsIterationsEntity, Long> {
}
