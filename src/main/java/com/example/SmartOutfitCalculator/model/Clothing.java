
package com.example.SmartOutfitCalculator.model;

import com.example.SmartOutfitCalculator.enums.Occasion;
import com.example.SmartOutfitCalculator.enums.Weather;
import com.example.SmartOutfitCalculator.enums.Style;

import java.util.Set;

public class Clothing {

    private String name;
    private String category;
    private String color;

    private Set<Occasion> occasions;
    private Set<Weather> weathers;
    private Style style;

    private int minTemperature;
    private int maxTemperature;

    // Constructor
    public Clothing(String name, String category, String color,
                    Set<Occasion> occasions, Set<Weather> weathers,
                    Style style, int minTemperature, int maxTemperature) {

        this.name = name;
        this.category = category;
        this.color = color;
        this.occasions = occasions;
        this.weathers = weathers;
        this.style = style;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public Set<Occasion> getOccasions() {
        return occasions;
    }

    public Set<Weather> getWeathers() {
        return weathers;
    }

    public Style getStyle() {
        return style;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
}
