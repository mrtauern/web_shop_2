package com.database.web_shop.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Reviews {
    private int id;
    private int rating;
    private String content;
    private Timestamp createDate;
    private Integer productsId;
    private Integer usersId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "rating")
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "ProductsID")
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Basic
    @Column(name = "UsersID")
    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reviews reviews = (Reviews) o;

        if (id != reviews.id) return false;
        if (rating != reviews.rating) return false;
        if (content != null ? !content.equals(reviews.content) : reviews.content != null) return false;
        if (createDate != null ? !createDate.equals(reviews.createDate) : reviews.createDate != null) return false;
        if (productsId != null ? !productsId.equals(reviews.productsId) : reviews.productsId != null) return false;
        if (usersId != null ? !usersId.equals(reviews.usersId) : reviews.usersId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + rating;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (productsId != null ? productsId.hashCode() : 0);
        result = 31 * result + (usersId != null ? usersId.hashCode() : 0);
        return result;
    }
}
