package com.database.web_shop.models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ProductsCategoriesPK implements Serializable {
    private int productsId;
    private int categoriesId;

    @Column(name = "ProductsID")
    @Id
    public int getProductsId() {
        return productsId;
    }

    public void setProductsId(int productsId) {
        this.productsId = productsId;
    }

    @Column(name = "CategoriesID")
    @Id
    public int getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(int categoriesId) {
        this.categoriesId = categoriesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsCategoriesPK that = (ProductsCategoriesPK) o;

        if (productsId != that.productsId) return false;
        if (categoriesId != that.categoriesId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productsId;
        result = 31 * result + categoriesId;
        return result;
    }
}
