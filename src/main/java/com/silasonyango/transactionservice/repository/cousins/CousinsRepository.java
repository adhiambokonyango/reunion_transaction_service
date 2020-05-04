package com.silasonyango.transactionservice.repository.cousins;

import com.silasonyango.transactionservice.entity_classes.cousins.CousinsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CousinsRepository extends JpaRepository<CousinsEntity, Long> {
}
