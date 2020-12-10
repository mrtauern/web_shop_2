package com.database.web_shop.models;

import javax.persistence.*;

@Entity
@Table(name = "Product_options_product_options_choice", schema = "web_shop", catalog = "")
@IdClass(ProductOptionsProductOptionsChoicePK.class)
public class ProductOptionsProductOptionsChoice {
    private int productOptionsId;
    private int productOptionsChoiceId;

    @Id
    @Column(name = "Product_optionsID")
    public int getProductOptionsId() {
        return productOptionsId;
    }

    public void setProductOptionsId(int productOptionsId) {
        this.productOptionsId = productOptionsId;
    }

    @Id
    @Column(name = "product_options_choiceID")
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

        ProductOptionsProductOptionsChoice that = (ProductOptionsProductOptionsChoice) o;

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
