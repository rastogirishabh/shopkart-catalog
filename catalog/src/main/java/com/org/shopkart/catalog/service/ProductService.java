package com.org.shopkart.catalog.service;

import com.org.shopkart.catalog.response.ProductResponseModel;

import java.util.List;

public interface ProductService {
     List<ProductResponseModel> fetchAllProducts();
}
