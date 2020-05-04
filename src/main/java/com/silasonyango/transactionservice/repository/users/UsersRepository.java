package com.silasonyango.transactionservice.repository.users;

import com.silasonyango.transactionservice.entity_classes.users.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
}
