package com.database.web_shop.models;

import javax.persistence.*;

@Entity
@Table(name = "credit_cards", schema = "web_shop", catalog = "")
public class CreditCards {
    private int id;
    private String cardholder;
    private long cardnumber;
    private int expYear;
    private Integer expMonth;
    private int cvv;
    private int usersId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cardholder")
    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    @Basic
    @Column(name = "cardnumber")
    public long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(long cardnumber) {
        this.cardnumber = cardnumber;
    }

    @Basic
    @Column(name = "exp_year")
    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    @Basic
    @Column(name = "exp_month")
    public Integer getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(Integer expMonth) {
        this.expMonth = expMonth;
    }

    @Basic
    @Column(name = "CVV")
    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Basic
    @Column(name = "usersID")
    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCards that = (CreditCards) o;

        if (id != that.id) return false;
        if (cardnumber != that.cardnumber) return false;
        if (expYear != that.expYear) return false;
        if (cvv != that.cvv) return false;
        if (usersId != that.usersId) return false;
        if (cardholder != null ? !cardholder.equals(that.cardholder) : that.cardholder != null) return false;
        if (expMonth != null ? !expMonth.equals(that.expMonth) : that.expMonth != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cardholder != null ? cardholder.hashCode() : 0);
        result = 31 * result + (int) (cardnumber ^ (cardnumber >>> 32));
        result = 31 * result + expYear;
        result = 31 * result + (expMonth != null ? expMonth.hashCode() : 0);
        result = 31 * result + cvv;
        result = 31 * result + usersId;
        return result;
    }
}
