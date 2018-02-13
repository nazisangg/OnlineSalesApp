package com.weChatAPP.OnlineSalesAPP.Model;

import javax.persistence.*;

@Entity
@Table(name = "Delivery")
public class Delivery{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "deliverMethod")
    private String deliverMethod;

    @Column(name = "deliverState")
    // thinking of change it into enum type
    private String deliverState;

    @Column(name = "deliverPrice")
    private Float deliverPrice;

    @OneToOne(cascade = CascadeType.ALL)
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliverMethod() {
        return deliverMethod;
    }

    public void setDeliverMethod(String deliverMethod) {
        this.deliverMethod = deliverMethod;
    }

    public String getDeliverState() {
        return deliverState;
    }

    public void setDeliverState(String deliverState) {
        this.deliverState = deliverState;
    }

    public Float getDeliverPrice() {
        return deliverPrice;
    }

    public void setDeliverPrice(Float deliverPrice) {
        this.deliverPrice = deliverPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}