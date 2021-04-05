package com.org.shopkart.catalog.repository;

import com.org.shopkart.catalog.entities.ProductImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductImageRepo extends JpaRepository<ProductImageEntity, Long> {
    List<ProductImageEntity> findByProductId(long productId);
}
