package com.database.web_shop.models;

import javax.persistence.*;

@Entity
@Table(name = "Products_Categories", schema = "web_shop", catalog = "")
@IdClass(ProductsCategoriesPK.class)
public class ProductsCategories {
    private int productsId;
    private int categoriesId;

    @Id
    @Column(name = "ProductsID")
    public int getProductsId() {
        return productsId;
    }

    public void setProductsId(int productsId) {
        this.productsId = productsId;
    }

    @Id
    @Column(name = "CategoriesID")
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

        ProductsCategories that = (ProductsCategories) o;

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
