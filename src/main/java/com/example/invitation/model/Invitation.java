package com.example.invitation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import sun.security.krb5.internal.crypto.Des;

import java.util.List;


@Document(collection = "document")
public class Invitation {


    @Id
    private String id;
    private String name;
    private String address;
    private List<String> phone;
    private List<String> ddescription;
    private Description decriptionprice;
    private Description descriptionprice2;
    private List<String> dquantity;
    private int totalprice;



    public Invitation() {

    }

    public Invitation(String id, String name, String address, List<String> phone, List<String> ddescription, Description decriptionprice, Description descriptionprice2, List<String> dquantity, int totalprice) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.ddescription = ddescription;
        this.decriptionprice = decriptionprice;
        this.descriptionprice2 = descriptionprice2;
        this.dquantity = dquantity;
        this.totalprice = totalprice;
    }



    public Invitation showInvitation(){
        return new Invitation();
    }

    /*
    public CategoryMade showCate(){
        Description description = new Description();
       return description.categoryMade;
    }

    public int showmx(){
        Description description = new Description();
        return  description.maxprice;
    }

    public int showmn(){
        Description description = new Description();
        return  description.minprice;
    }


    public Description showCategory(){

        return (Description) decriptionprice.stream().map(Description::getCategoryMade);

    }


    public Description showMaxPrice(){
        return (Description)decriptionprice.stream().map(Description::getMaxprice);
    }

    public Description showMinPrice(){
        return (Description)decriptionprice.stream().map(Description::getMinprice);
    }

*/


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

    public Description getDecriptionprice() {
        return decriptionprice;
    }

    public void setDecriptionprice(Description decriptionprice) {
        this.decriptionprice = decriptionprice;
    }

    public Description getDescriptionprice2() {
        return descriptionprice2;
    }

    public void setDescriptionprice2(Description descriptionprice2) {
        this.descriptionprice2 = descriptionprice2;
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
