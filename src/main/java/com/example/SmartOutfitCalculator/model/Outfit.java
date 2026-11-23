
package com.example.SmartOutfitCalculator.model;

import java.util.List;

public class Outfit {

    private Clothing top;
    private Clothing bottom;
    private Clothing shoes;
    private List<Clothing> accessories;
    private String reason;

    // Constructor
    public Outfit(Clothing top, Clothing bottom,
                  Clothing shoes, List<Clothing> accessories,
                  String reason) {

        this.top = top;
        this.bottom = bottom;
        this.shoes = shoes;
        this.accessories = accessories;
        this.reason = reason;
    }

    // Getter Methods
    public Clothing getTop() {
        return top;
    }

    public Clothing getBottom() {
        return bottom;
    }

    public Clothing getShoes() {
        return shoes;
    }

    public List<Clothing> getAccessories() {
        return accessories;
    }

    public String getReason() {
        return reason;
    }
}
