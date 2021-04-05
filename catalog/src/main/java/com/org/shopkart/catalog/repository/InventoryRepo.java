package com.org.shopkart.catalog.repository;

import com.org.shopkart.catalog.entities.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<InventoryEntity, Long> {
}
