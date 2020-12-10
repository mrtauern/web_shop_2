package com.database.web_shop.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Orders {
    private int id;
    private Integer trackingNumber;
    private String orderFirstname;
    private String orderLastname;
    private String orderStreetname;
    private String orderStreetnumber;
    private String orderTown;
    private String orderZip;
    private String orderEmail;
    private int orderPhone;
    private Timestamp createDate;
    private String comment;
    private Integer usersId;
    private Integer orderStatusId;
    private int countriesId;
    private Integer creditCardsId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tracking_number")
    public Integer getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Basic
    @Column(name = "order_firstname")
    public String getOrderFirstname() {
        return orderFirstname;
    }

    public void setOrderFirstname(String orderFirstname) {
        this.orderFirstname = orderFirstname;
    }

    @Basic
    @Column(name = "order_lastname")
    public String getOrderLastname() {
        return orderLastname;
    }

    public void setOrderLastname(String orderLastname) {
        this.orderLastname = orderLastname;
    }

    @Basic
    @Column(name = "order_streetname")
    public String getOrderStreetname() {
        return orderStreetname;
    }

    public void setOrderStreetname(String orderStreetname) {
        this.orderStreetname = orderStreetname;
    }

    @Basic
    @Column(name = "order_streetnumber")
    public String getOrderStreetnumber() {
        return orderStreetnumber;
    }

    public void setOrderStreetnumber(String orderStreetnumber) {
        this.orderStreetnumber = orderStreetnumber;
    }

    @Basic
    @Column(name = "order_town")
    public String getOrderTown() {
        return orderTown;
    }

    public void setOrderTown(String orderTown) {
        this.orderTown = orderTown;
    }

    @Basic
    @Column(name = "order_zip")
    public String getOrderZip() {
        return orderZip;
    }

    public void setOrderZip(String orderZip) {
        this.orderZip = orderZip;
    }

    @Basic
    @Column(name = "order_email")
    public String getOrderEmail() {
        return orderEmail;
    }

    public void setOrderEmail(String orderEmail) {
        this.orderEmail = orderEmail;
    }

    @Basic
    @Column(name = "order_phone")
    public int getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(int orderPhone) {
        this.orderPhone = orderPhone;
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
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "UsersID")
    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    @Basic
    @Column(name = "Order_statusID")
    public Integer getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    @Basic
    @Column(name = "CountriesID")
    public int getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(int countriesId) {
        this.countriesId = countriesId;
    }

    @Basic
    @Column(name = "credit_cardsID")
    public Integer getCreditCardsId() {
        return creditCardsId;
    }

    public void setCreditCardsId(Integer creditCardsId) {
        this.creditCardsId = creditCardsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (id != orders.id) return false;
        if (orderPhone != orders.orderPhone) return false;
        if (countriesId != orders.countriesId) return false;
        if (trackingNumber != null ? !trackingNumber.equals(orders.trackingNumber) : orders.trackingNumber != null)
            return false;
        if (orderFirstname != null ? !orderFirstname.equals(orders.orderFirstname) : orders.orderFirstname != null)
            return false;
        if (orderLastname != null ? !orderLastname.equals(orders.orderLastname) : orders.orderLastname != null)
            return false;
        if (orderStreetname != null ? !orderStreetname.equals(orders.orderStreetname) : orders.orderStreetname != null)
            return false;
        if (orderStreetnumber != null ? !orderStreetnumber.equals(orders.orderStreetnumber) : orders.orderStreetnumber != null)
            return false;
        if (orderTown != null ? !orderTown.equals(orders.orderTown) : orders.orderTown != null) return false;
        if (orderZip != null ? !orderZip.equals(orders.orderZip) : orders.orderZip != null) return false;
        if (orderEmail != null ? !orderEmail.equals(orders.orderEmail) : orders.orderEmail != null) return false;
        if (createDate != null ? !createDate.equals(orders.createDate) : orders.createDate != null) return false;
        if (comment != null ? !comment.equals(orders.comment) : orders.comment != null) return false;
        if (usersId != null ? !usersId.equals(orders.usersId) : orders.usersId != null) return false;
        if (orderStatusId != null ? !orderStatusId.equals(orders.orderStatusId) : orders.orderStatusId != null)
            return false;
        if (creditCardsId != null ? !creditCardsId.equals(orders.creditCardsId) : orders.creditCardsId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (trackingNumber != null ? trackingNumber.hashCode() : 0);
        result = 31 * result + (orderFirstname != null ? orderFirstname.hashCode() : 0);
        result = 31 * result + (orderLastname != null ? orderLastname.hashCode() : 0);
        result = 31 * result + (orderStreetname != null ? orderStreetname.hashCode() : 0);
        result = 31 * result + (orderStreetnumber != null ? orderStreetnumber.hashCode() : 0);
        result = 31 * result + (orderTown != null ? orderTown.hashCode() : 0);
        result = 31 * result + (orderZip != null ? orderZip.hashCode() : 0);
        result = 31 * result + (orderEmail != null ? orderEmail.hashCode() : 0);
        result = 31 * result + orderPhone;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (usersId != null ? usersId.hashCode() : 0);
        result = 31 * result + (orderStatusId != null ? orderStatusId.hashCode() : 0);
        result = 31 * result + countriesId;
        result = 31 * result + (creditCardsId != null ? creditCardsId.hashCode() : 0);
        return result;
    }
}
