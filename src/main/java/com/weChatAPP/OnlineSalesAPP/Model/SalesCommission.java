package com.weChatAPP.OnlineSalesAPP.Model;

import javax.persistence.*;

@Entity
@Table(name = "salesCommission")
public class SalesCommission{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "price")
    private float price;

    @Column(name = "whetherPaid")
    private boolean whetherPaid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sales_id", referencedColumnName = "id")
    private Sales sales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isWhetherPaid() {
        return whetherPaid;
    }

    public void setWhetherPaid(boolean whetherPaid) {
        this.whetherPaid = whetherPaid;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }
}