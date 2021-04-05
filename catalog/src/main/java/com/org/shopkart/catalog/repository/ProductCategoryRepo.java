package com.org.shopkart.catalog.repository;

import com.org.shopkart.catalog.entities.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepo extends JpaRepository<ProductCategoryEntity, Long> {
}
