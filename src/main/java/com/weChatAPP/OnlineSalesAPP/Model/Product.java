package com.weChatAPP.OnlineSalesAPP.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @Column(name = "totalSold")
    private Long totalSold;

    @OneToOne(cascade = CascadeType.ALL)
    private Storages storages;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "shoppingCart_has_product",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "shoppingCart_id", referencedColumnName = "id"))
    private Set<ShoppingCart> shoppingCartSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(Long totalSold) {
        this.totalSold = totalSold;
    }

    public Storages getStorages() {
        return storages;
    }

    public void setStorages(Storages storages) {
        this.storages = storages;
    }

    public Set<ShoppingCart> getShoppingCartSet() {
        return shoppingCartSet;
    }

    public void setShoppingCartSet(Set<ShoppingCart> shoppingCartSet) {
        this.shoppingCartSet = shoppingCartSet;
    }
}