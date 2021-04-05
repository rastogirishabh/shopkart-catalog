package com.org.shopkart.catalog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "price")
public class PriceEntity {
    @Id
    @Column(name = "product_id")
    private long productId;

    @Column(name = "price")
    private double price;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PriceEntity{" +
                "productId=" + productId +
                ", price=" + price +
                '}';
    }
}
