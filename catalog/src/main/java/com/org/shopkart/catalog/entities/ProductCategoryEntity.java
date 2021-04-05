package com.org.shopkart.catalog.entities;

import javax.persistence.*;

@Entity
@Table(name = "product_category")
public class ProductCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private long categoryId;

    @Column(name = "category_description")
    private String categoryDescription;

    @Override
    public String toString() {
        return "ProductCategoryEntity{" +
                "categoryId=" + categoryId +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
