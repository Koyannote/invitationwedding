package com.example.invitation.model;

import java.util.List;

public class  Description{



    public CategoryMade categoryMade;
    public int maxprice;
    public int minprice;

    public Description(CategoryMade categoryMade, int maxprice, int minprice) {
        this.categoryMade = categoryMade;
        this.maxprice = maxprice;
        this.minprice = minprice;
    }

    public Description() {
    }

    public CategoryMade getCategoryMade() {
        return categoryMade;
    }

    public void setCategoryMade(CategoryMade categoryMade) {
        this.categoryMade = categoryMade;
    }

    public int getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(int maxprice) {
        this.maxprice = maxprice;
    }

    public int getMinprice() {
        return minprice;
    }

    public void setMinprice(int minprice) {
        this.minprice = minprice;
    }

    @Override
    public String toString() {
        return
                "categoryMade=" + categoryMade +
                ", maxprice=" + maxprice +
                ", minprice=" + minprice ;
    }
}
