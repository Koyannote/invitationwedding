package com.example.invitation.model;

import java.util.List;

public class  Description{



    private CategoryMade categoryMade;
    private List<Integer> price;

    public Description() {
    }

    public Description(CategoryMade categoryMade, List<Integer> price) {
        this.categoryMade = categoryMade;
        this.price = price;

    }

    public CategoryMade getCategoryMade() {
        return categoryMade;
    }

    public void setCategoryMade(CategoryMade categoryMade) {
        this.categoryMade = categoryMade;
    }



    public List<Integer> getPrice() {
        return price;
    }

    public void setPrice(List<Integer> price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" +
                "CategoryMade=" + categoryMade +
                ", price=" + price
                ;
    }
}
