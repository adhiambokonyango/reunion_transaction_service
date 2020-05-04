package com.silasonyango.transactionservice.repository.personal_detail;

import com.silasonyango.transactionservice.entity_classes.personal_detail.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
