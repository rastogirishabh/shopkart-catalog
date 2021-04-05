package com.org.shopkart.catalog.resources;

import com.org.shopkart.catalog.response.ProductResponseModel;
import com.org.shopkart.catalog.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Product {
    @Autowired
    ProductService productService;

    final private static Logger logger = LoggerFactory.getLogger(Product.class);

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponseModel>> fetchAllProducts() {
        logger.info("inside Product controller --> fetchAllProducts");
        return new ResponseEntity<>(productService.fetchAllProducts(), HttpStatus.OK);
    }
}
