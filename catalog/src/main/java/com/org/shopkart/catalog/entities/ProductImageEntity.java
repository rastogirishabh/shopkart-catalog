package com.org.shopkart.catalog.entities;

import javax.persistence.*;

@Entity
@Table(name = "product_image")

public class ProductImageEntity {
    @Id
    @Column(name = "product_id")
    private long productId;

    @Column(name="image_id")
    private int imageId;

    @Column(name = "image_url")
    private String imageURL;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "ProductImageEntity{" +
                "productId=" + productId +
                ", imageId=" + imageId +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
