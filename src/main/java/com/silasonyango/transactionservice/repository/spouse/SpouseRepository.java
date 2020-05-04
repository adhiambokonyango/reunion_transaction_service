package com.silasonyango.transactionservice.repository.spouse;

import com.silasonyango.transactionservice.entity_classes.siblings.SiblingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpouseRepository extends JpaRepository<SiblingsEntity, Long> {
}
