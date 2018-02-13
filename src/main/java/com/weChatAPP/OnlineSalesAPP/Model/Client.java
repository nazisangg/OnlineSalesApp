package com.weChatAPP.OnlineSalesAPP.Model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "user")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "weChatName", nullable=false,length=8)
    private String weChatName;
    @Column(name = "whetherMember" )
    private boolean whetherMember;
    @Column(name = "whetherLoginBefore")
    private boolean whetherLoginBefore;

    @OneToMany(mappedBy = "client", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    // name is the name of forgin key in this table amd referencedColumnName is the reference column in another table
    private Set<ShoppingCart> books = new HashSet<ShoppingCart>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeChatName() {
        return weChatName;
    }

    public void setWeChatName(String weChatName) {
        this.weChatName = weChatName;
    }

    public boolean isWhetherMember() {
        return whetherMember;
    }

    public void setWhetherMember(boolean whetherMember) {
        this.whetherMember = whetherMember;
    }

    public boolean isWhetherLoginBefore() {
        return whetherLoginBefore;
    }

    public void setWhetherLoginBefore(boolean whetherLoginBefore) {
        this.whetherLoginBefore = whetherLoginBefore;
    }
}