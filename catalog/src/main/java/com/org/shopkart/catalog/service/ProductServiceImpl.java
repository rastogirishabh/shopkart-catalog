package com.org.shopkart.catalog.service;

import com.org.shopkart.catalog.entities.ProductEntity;
import com.org.shopkart.catalog.repository.*;
import com.org.shopkart.catalog.response.ProductResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    ProductRepo productRepo;
    @Autowired
    ProductImageRepo imageRepo;
    @Autowired
    ProductCategoryRepo categoryRepo;
    @Autowired
    InventoryRepo inventoryRepo;
    @Autowired
    PriceRepo priceRepo;

    @Override
    public List<ProductResponseModel> fetchAllProducts() {
        logger.info("inside ProductServiceImpl --> fetchAllProducts");
        List<ProductEntity> productList = productRepo.findAll();
        logger.info("productList --> \n" +productList);
        logger.info("--> Copying data from productEntity to productResponseModel <--");
        List<ProductResponseModel> productResponseModelList = new ArrayList<>();
        productList.forEach(productEntity -> {
                    ProductResponseModel productResponseModel = new ProductResponseModel();
                    BeanUtils.copyProperties(productEntity,productResponseModel);
                    productResponseModel.setImageURL(imageRepo.findByProductId(productEntity.getProductId())
                            .stream().map(productImageEntity->productImageEntity.getImageURL())
                            .collect(Collectors.toList())
                    );
                    productResponseModel.setCategoryName(categoryRepo.getOne((long)productEntity.getCategoryId()).getCategoryDescription());
                    productResponseModel.setQty(inventoryRepo.getOne(productEntity.getProductId()).getQty());
                    productResponseModel.setPrice(priceRepo.getOne(productEntity.getProductId()).getPrice());
                    logger.info("productResponseModel for product : " + productEntity.getProductId());
                    logger.info(String.valueOf(productResponseModel));
                    productResponseModelList.add(productResponseModel);
                });
        logger.info("productResponseModelList --> \n" +productResponseModelList);

        return productResponseModelList;

    }
}
