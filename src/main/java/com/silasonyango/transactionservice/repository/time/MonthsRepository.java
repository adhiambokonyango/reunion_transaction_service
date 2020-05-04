package com.silasonyango.transactionservice.repository.time;

import com.silasonyango.transactionservice.entity_classes.time.MonthsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthsRepository extends JpaRepository<MonthsEntity, Long> {
}
