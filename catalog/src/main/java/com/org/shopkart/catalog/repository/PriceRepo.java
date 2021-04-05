package com.org.shopkart.catalog.repository;

import com.org.shopkart.catalog.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository<PriceEntity, Long> {
}
