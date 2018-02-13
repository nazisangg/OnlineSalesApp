package com.weChatAPP.OnlineSalesAPP.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sales")
public class Sales{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "saleWechatId")
    private String saleWeChatId;

    @OneToMany(mappedBy = "id")
    private Set<Order> orderSet;

    @OneToMany(mappedBy = "id")
    private Set<SalesCommission> salesCommissionSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSaleWeChatId() {
        return saleWeChatId;
    }

    public void setSaleWeChatId(String saleWeChatId) {
        this.saleWeChatId = saleWeChatId;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }

    public Set<SalesCommission> getSalesCommissionSet() {
        return salesCommissionSet;
    }

    public void setSalesCommissionSet(Set<SalesCommission> salesCommissionSet) {
        this.salesCommissionSet = salesCommissionSet;
    }
}