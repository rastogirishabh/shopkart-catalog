package com.org.shopkart.catalog.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {
    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "product_id")
    private long productId;

    @Column(name = "product_title")
    private String productTitle;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "categoryId")
    private int categoryId;

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public long getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "productId=" + productId +
                ", productTitle='" + productTitle + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
