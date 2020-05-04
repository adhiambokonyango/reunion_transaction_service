package com.silasonyango.transactionservice.repository.time;

import com.silasonyango.transactionservice.entity_classes.time.QuarterIterationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuarterIterationRepository extends JpaRepository<QuarterIterationEntity, Long> {
}
