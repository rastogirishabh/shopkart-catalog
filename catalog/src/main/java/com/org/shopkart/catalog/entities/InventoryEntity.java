package com.org.shopkart.catalog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class InventoryEntity {
    @Id
    @Column(name = "product_id")
    private long productId;

    @Column(name = "qty")
    private int qty;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "productId=" + productId +
                ", qty=" + qty +
                '}';
    }
}
