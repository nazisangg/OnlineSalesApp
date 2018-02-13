package com.weChatAPP.OnlineSalesAPP.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "storage")
public class Storages{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "productLeft")
    private Long productLeft;

    @Column(name = "nextSuppleData")
    private Date nextSuppleData;

    @Column(name = "predictSupplement")
    private Long predictSupplement;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductLeft() {
        return productLeft;
    }

    public void setProductLeft(Long productLeft) {
        this.productLeft = productLeft;
    }

    public Date getNextSuppleData() {
        return nextSuppleData;
    }

    public void setNextSuppleData(Date nextSuppleData) {
        this.nextSuppleData = nextSuppleData;
    }

    public Long getPredictSupplement() {
        return predictSupplement;
    }

    public void setPredictSupplement(Long predictSupplement) {
        this.predictSupplement = predictSupplement;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}