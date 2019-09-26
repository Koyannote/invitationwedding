package com.example.invitation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "document")
public class Invitation {


    @Id
    private String id;
    private String name;
    private String address;
    private List<String> phone;
    private List<String> ddescription;
    private List<Description> decriptionprice;
    private List<String> dquantity;
    private int totalprice;


    public Invitation() {
    }

    public Invitation(String name, String address, List<String> phone, List<String> ddescription, List<Description> decriptionprice, List<String> dquantity, int totalprice) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.ddescription = ddescription;
        this.decriptionprice = decriptionprice;
        this.dquantity = dquantity;
        this.totalprice = totalprice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getDdescription() {
        return ddescription;
    }

    public void setDdescription(List<String> ddescription) {
        this.ddescription = ddescription;
    }

    public List<Description> getDecriptionprice() {
        return decriptionprice;
    }

    public void setDecriptionprice(List<Description> decriptionprice) {
        this.decriptionprice = decriptionprice;
    }

    public List<String> getDquantity() {
        return dquantity;
    }

    public void setDquantity(List<String> dquantity) {
        this.dquantity = dquantity;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }
}
