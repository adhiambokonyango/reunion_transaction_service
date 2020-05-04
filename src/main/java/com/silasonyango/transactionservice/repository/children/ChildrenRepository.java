package com.silasonyango.transactionservice.repository.children;

import com.silasonyango.transactionservice.entity_classes.children.ChildrenEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildrenRepository extends JpaRepository<ChildrenEntity, Long> {
}
