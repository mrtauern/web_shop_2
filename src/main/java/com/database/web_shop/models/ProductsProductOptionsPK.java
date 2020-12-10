package com.database.web_shop.models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ProductsProductOptionsPK implements Serializable {
    private int productsId;
    private int productOptionsId;

    @Column(name = "ProductsID")
    @Id
    public int getProductsId() {
        return productsId;
    }

    public void setProductsId(int productsId) {
        this.productsId = productsId;
    }

    @Column(name = "Product_optionsID")
    @Id
    public int getProductOptionsId() {
        return productOptionsId;
    }

    public void setProductOptionsId(int productOptionsId) {
        this.productOptionsId = productOptionsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsProductOptionsPK that = (ProductsProductOptionsPK) o;

        if (productsId != that.productsId) return false;
        if (productOptionsId != that.productOptionsId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productsId;
        result = 31 * result + productOptionsId;
        return result;
    }
}
