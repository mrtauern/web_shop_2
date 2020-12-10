package com.database.web_shop.models;

import javax.persistence.*;

@Entity
@Table(name = "Products_Product_options", schema = "web_shop", catalog = "")
@IdClass(ProductsProductOptionsPK.class)
public class ProductsProductOptions {
    private int productsId;
    private int productOptionsId;

    @Id
    @Column(name = "ProductsID")
    public int getProductsId() {
        return productsId;
    }

    public void setProductsId(int productsId) {
        this.productsId = productsId;
    }

    @Id
    @Column(name = "Product_optionsID")
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

        ProductsProductOptions that = (ProductsProductOptions) o;

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
