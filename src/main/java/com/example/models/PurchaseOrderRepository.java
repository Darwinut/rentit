package com.example.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PurchaseOrderRepository
		extends JpaRepository<PurchaseOrder, Long>, QueryDslPredicateExecutor<PlantInventoryEntry> {

}
