package com.silasonyango.transactionservice.repository.personal_detail;

import com.silasonyango.transactionservice.entity_classes.personal_detail.ContactsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<ContactsEntity, Long> {
}
