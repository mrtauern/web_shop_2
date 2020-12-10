package com.database.web_shop.models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ProductOptionsProductOptionsChoicePK implements Serializable {
    private int productOptionsId;
    private int productOptionsChoiceId;

    @Column(name = "Product_optionsID")
    @Id
    public int getProductOptionsId() {
        return productOptionsId;
    }

    public void setProductOptionsId(int productOptionsId) {
        this.productOptionsId = productOptionsId;
    }

    @Column(name = "product_options_choiceID")
    @Id
    public int getProductOptionsChoiceId() {
        return productOptionsChoiceId;
    }

    public void setProductOptionsChoiceId(int productOptionsChoiceId) {
        this.productOptionsChoiceId = productOptionsChoiceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductOptionsProductOptionsChoicePK that = (ProductOptionsProductOptionsChoicePK) o;

        if (productOptionsId != that.productOptionsId) return false;
        if (productOptionsChoiceId != that.productOptionsChoiceId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productOptionsId;
        result = 31 * result + productOptionsChoiceId;
        return result;
    }
}
