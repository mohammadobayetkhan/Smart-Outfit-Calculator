
package com.example.SmartOutfitCalculator.service;

import com.example.SmartOutfitCalculator.model.Clothing;
import com.example.SmartOutfitCalculator.model.Outfit;
import com.example.SmartOutfitCalculator.enums.Occasion;
import com.example.SmartOutfitCalculator.enums.Weather;
import com.example.SmartOutfitCalculator.enums.Style;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class OutfitService {

    private final List<Clothing> clothingList = new ArrayList<>();

    public OutfitService() {
        loadClothingData();
    }

    // Load predefined clothing data
    private void loadClothingData() {

        // T-Shirts
        add("White T-Shirt", "T-Shirt", "White",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 20, 40);

        add("Black T-Shirt", "T-Shirt", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL, Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 20, 40);

        add("Navy Blue T-Shirt", "T-Shirt", "Navy Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 20, 40);

        // Polo Shirts
        add("Black Polo Shirt", "Polo Shirt", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.OFFICE, Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 38);

        add("White Polo Shirt", "Polo Shirt", "White",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 38);

        add("Navy Blue Polo Shirt", "Polo Shirt", "Navy Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.OFFICE, Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 38);

        // Casual Shirts
        add("Light Blue Casual Shirt", "Casual Shirt", "Light Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 38);

        add("White Casual Shirt", "Casual Shirt", "White",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 38);

        // Formal Shirts
        add("White Formal Shirt", "Formal Shirt", "White",
                Set.of(Occasion.OFFICE, Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 18, 38);

        add("Sky Blue Formal Shirt", "Formal Shirt", "Sky Blue",
                Set.of(Occasion.OFFICE, Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 18, 38);

        add("Light Grey Formal Shirt", "Formal Shirt", "Light Grey",
                Set.of(Occasion.OFFICE, Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 18, 38);

        // Jeans
        add("Blue Jeans", "Jeans", "Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.RAINY, Weather.CLOUDY),
                Style.CASUAL, 15, 40);

        add("Black Jeans", "Jeans", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.RAINY, Weather.CLOUDY),
                Style.CASUAL, 15, 40);

        // Chinos
        add("Beige Chinos", "Chinos", "Beige",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.OFFICE, Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 38);

        add("Navy Blue Chinos", "Chinos", "Navy Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.OFFICE, Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 38);

        // Formal Pants
        add("Black Formal Pants", "Formal Pants", "Black",
                Set.of(Occasion.OFFICE, Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 18, 38);

        add("Grey Formal Pants", "Formal Pants", "Grey",
                Set.of(Occasion.OFFICE, Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 18, 38);

        // Sneakers
        add("White Sneakers", "Sneakers", "White",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 40);

        add("Black Sneakers", "Sneakers", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 40);

        // Formal Shoes
        add("Black Formal Shoes", "Formal Shoes", "Black",
                Set.of(Occasion.OFFICE, Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.RAINY, Weather.CLOUDY),
                Style.FORMAL, 18, 40);

        add("Brown Formal Shoes", "Formal Shoes", "Brown",
                Set.of(Occasion.OFFICE, Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 18, 40);

        // Loafers
        add("Brown Loafers", "Loafers", "Brown",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.OFFICE, Occasion.PARTY,
                        Occasion.WEDDING),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.CASUAL, 18, 40);

        // Sandals
        add("Black Sandals", "Sandals", "Black",
                Set.of(Occasion.CASUAL, Occasion.UNIVERSITY,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.RAINY),
                Style.CASUAL, 20, 40);

        // Jackets
        add("Black Jacket", "Jacket", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.PARTY),
                Set.of(Weather.CLOUDY, Weather.RAINY),
                Style.CASUAL, 5, 22);

        add("Navy Blue Jacket", "Jacket", "Navy Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL),
                Set.of(Weather.CLOUDY, Weather.RAINY),
                Style.CASUAL, 5, 22);

        // Hoodies
        add("Grey Hoodie", "Hoodie", "Grey",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL),
                Set.of(Weather.CLOUDY, Weather.RAINY),
                Style.CASUAL, 5, 20);

        add("Black Hoodie", "Hoodie", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL),
                Set.of(Weather.CLOUDY, Weather.RAINY),
                Style.CASUAL, 5, 20);

        // Sweaters
        add("Navy Blue Sweater", "Sweater", "Navy Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL,
                        Occasion.OFFICE),
                Set.of(Weather.CLOUDY, Weather.RAINY),
                Style.CASUAL, 5, 20);

        add("Grey Sweater", "Sweater", "Grey",
                Set.of(Occasion.UNIVERSITY, Occasion.CASUAL),
                Set.of(Weather.CLOUDY, Weather.RAINY),
                Style.CASUAL, 5, 20);

        // Blazers
        add("Black Blazer", "Blazer", "Black",
                Set.of(Occasion.OFFICE, Occasion.WEDDING,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 15, 30);

        add("Navy Blue Blazer", "Blazer", "Navy Blue",
                Set.of(Occasion.OFFICE, Occasion.WEDDING,
                        Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.FORMAL, 15, 30);

        // Panjabi
        add("White Panjabi", "Panjabi", "White",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Black Panjabi", "Panjabi", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Navy Blue Panjabi", "Panjabi", "Navy Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Maroon Panjabi", "Panjabi", "Maroon",
                Set.of(Occasion.WEDDING, Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Olive Panjabi", "Panjabi", "Olive",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Sky Blue Panjabi", "Panjabi", "Sky Blue",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Cream Panjabi", "Panjabi", "Cream",
                Set.of(Occasion.WEDDING, Occasion.PARTY),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        // Pajama
        add("White Pajama", "Pajama", "White",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Cream Pajama", "Pajama", "Cream",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Beige Pajama", "Pajama", "Beige",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Black Pajama", "Pajama", "Black",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Grey Pajama", "Pajama", "Grey",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);

        add("Brown Pajama", "Pajama", "Brown",
                Set.of(Occasion.UNIVERSITY, Occasion.WEDDING,
                        Occasion.PARTY, Occasion.CASUAL),
                Set.of(Weather.SUNNY, Weather.CLOUDY),
                Style.TRADITIONAL, 18, 38);
    }

    // Add clothing to the predefined list
    private void add(String name, String category, String color,
                     Set<Occasion> occasions, Set<Weather> weathers,
                     Style style, int minTemperature, int maxTemperature) {

        clothingList.add(new Clothing(
                name, category, color, occasions, weathers,
                style, minTemperature, maxTemperature
        ));
    }

    // Filter clothes according to occasion, weather and temperature
    public List<Clothing> getMatchingClothes(
            Occasion occasion,
            Weather weather,
            int temperature,
            Style style) {

        List<Clothing> matchingClothes = new ArrayList<>();

        for (Clothing clothing : clothingList) {

            boolean occasionMatches =
                    clothing.getOccasions().contains(occasion);

            // Viva/Interview uses office-appropriate clothing
            if (occasion == Occasion.VIVA_INTERVIEW) {
                occasionMatches =
                        clothing.getOccasions().contains(Occasion.OFFICE);
            }

            if (occasionMatches
                    && clothing.getWeathers().contains(weather)
                    && temperature >= clothing.getMinTemperature()
                    && temperature <= clothing.getMaxTemperature()) {

                matchingClothes.add(clothing);
            }
        }

        return matchingClothes;
    }

    // Generate complete outfit recommendations
    public List<Outfit> generateOutfits(
            Occasion occasion,
            Weather weather,
            int temperature,
            Style style) {

        List<Clothing> matchingClothes =
                getMatchingClothes(occasion, weather, temperature, style);

        List<Clothing> tops = new ArrayList<>();
        List<Clothing> bottoms = new ArrayList<>();
        List<Clothing> shoes = new ArrayList<>();

        // Separate clothes by category
        for (Clothing clothing : matchingClothes) {

            String category = clothing.getCategory();

            if (category.equals("T-Shirt")
                    || category.equals("Polo Shirt")
                    || category.equals("Casual Shirt")
                    || category.equals("Formal Shirt")
                    || category.equals("Panjabi")) {

                tops.add(clothing);

            } else if (category.equals("Jeans")
                    || category.equals("Chinos")
                    || category.equals("Formal Pants")
                    || category.equals("Pajama")) {

                bottoms.add(clothing);

            } else if (category.equals("Sneakers")
                    || category.equals("Formal Shoes")
                    || category.equals("Loafers")
                    || category.equals("Sandals")) {

                shoes.add(clothing);
            }
        }

        List<Outfit> outfits = new ArrayList<>();

        List<String> usedTopCategories = new ArrayList<>();
        List<String> usedBottomCategories = new ArrayList<>();
        List<String> usedCombinations = new ArrayList<>();

        // Generate possible combinations
        for (Clothing top : tops) {

            for (Clothing bottom : bottoms) {

                // Check whether the clothing categories match
                if (!isCategoryCompatible(top, bottom)) {
                    continue;
                }

                // Check color compatibility
                if (!isColorCompatible(top, bottom)) {
                    continue;
                }

                for (Clothing shoe : shoes) {

                    if (!isShoesCompatible(bottom, shoe)) {
                        continue;
                    }

                    String combination =
                            top.getName() + bottom.getName();

                    // Avoid repeating the same top and bottom
                    if (usedCombinations.contains(combination)) {
                        continue;
                    }

                    List<Clothing> accessories =
                            getSuitableAccessories(matchingClothes, temperature);

                    String reason = createReason(
                            top, bottom, shoe,
                            occasion, weather, temperature
                    );

                    // Viva/Interview: without blazer
                    if (occasion == Occasion.VIVA_INTERVIEW) {

                        outfits.add(new Outfit(
                                top,
                                bottom,
                                shoe,
                                new ArrayList<>(),
                                reason + " This is a professional look without a blazer."
                        ));

                        usedCombinations.add(combination);

                        if (outfits.size() == 1) {

                            // Viva/Interview: with blazer
                            for (Clothing clothing : matchingClothes) {

                                if (clothing.getCategory().equals("Blazer")) {

                                    List<Clothing> blazerList = new ArrayList<>();
                                    blazerList.add(clothing);

                                    outfits.add(new Outfit(
                                            top,
                                            bottom,
                                            shoe,
                                            blazerList,
                                            reason + " A blazer adds a more professional appearance."
                                    ));

                                    break;
                                }
                            }
                        }

                    } else {

                        // Prefer different top and bottom categories
                        if (usedTopCategories.contains(top.getCategory())
                                && usedBottomCategories.contains(bottom.getCategory())) {
                            continue;
                        }

                        outfits.add(new Outfit(
                                top,
                                bottom,
                                shoe,
                                accessories,
                                reason
                        ));

                        usedCombinations.add(combination);
                        usedTopCategories.add(top.getCategory());
                        usedBottomCategories.add(bottom.getCategory());
                    }

                    if (outfits.size() >= 3) {
                        return outfits;
                    }
                }
            }
        }

        return outfits;
    }

    // Check whether top and bottom categories can be combined
    private boolean isCategoryCompatible(Clothing top, Clothing bottom) {

        String topCategory = top.getCategory();
        String bottomCategory = bottom.getCategory();

        // Panjabi must be paired with Pajama
        if (topCategory.equals("Panjabi")) {
            return bottomCategory.equals("Pajama");
        }

        // Pajama must be paired with Panjabi
        if (bottomCategory.equals("Pajama")) {
            return false;
        }

        // Formal pants should be paired with formal shirts
        if (bottomCategory.equals("Formal Pants")) {
            return topCategory.equals("Formal Shirt");
        }

        // Formal shirts can be paired with formal pants or chinos
        if (topCategory.equals("Formal Shirt")) {
            return bottomCategory.equals("Formal Pants")
                    || bottomCategory.equals("Chinos");
        }

        // Casual tops can be paired with jeans or chinos
        return bottomCategory.equals("Jeans")
                || bottomCategory.equals("Chinos");
    }

    // Check top and bottom color compatibility
    private boolean isColorCompatible(Clothing top, Clothing bottom) {

        String topCategory = top.getCategory();
        String topColor = top.getColor();
        String bottomColor = bottom.getColor();

        // Panjabi and Pajama color matching
        if (topCategory.equals("Panjabi")) {

            switch (topColor) {

                case "White":
                    return Set.of("White", "Cream", "Beige").contains(bottomColor);

                case "Black":
                    return Set.of("Black", "White", "Grey").contains(bottomColor);

                case "Navy Blue":
                    return Set.of("White", "Cream", "Beige").contains(bottomColor);

                case "Maroon":
                    return Set.of("White", "Cream", "Black").contains(bottomColor);

                case "Olive":
                    return Set.of("Beige", "White", "Black").contains(bottomColor);

                case "Sky Blue":
                    return Set.of("White", "Cream", "Beige").contains(bottomColor);

                case "Cream":
                    return Set.of("White", "Beige", "Brown").contains(bottomColor);

                default:
                    return false;
            }
        }

        // General outfit color matching
        switch (topColor) {

            case "White":
                return Set.of("Blue", "Black", "Beige", "Navy Blue", "Grey")
                        .contains(bottom.getColor());

            case "Black":
                return Set.of("Blue", "Black", "Beige", "Grey", "Navy Blue")
                        .contains(bottom.getColor());

            case "Navy Blue":
                return Set.of("Beige", "Grey", "Black", "Blue")
                        .contains(bottom.getColor());

            case "Light Blue":
            case "Sky Blue":
                return Set.of("Navy Blue", "Black", "Beige", "Blue", "Grey")
                        .contains(bottom.getColor());

            case "Light Grey":
                return Set.of("Black", "Navy Blue", "Grey")
                        .contains(bottom.getColor());

            default:
                return false;
        }
    }

    // Check footwear compatibility
    private boolean isShoesCompatible(Clothing bottom, Clothing shoe) {

        String bottomColor = bottom.getColor();
        String shoeCategory = shoe.getCategory();
        String shoeColor = shoe.getColor();

        if (shoeCategory.equals("Formal Shoes")) {

            if (shoeColor.equals("Black")) {
                return Set.of("Black", "Grey", "Navy Blue", "Blue", "White")
                        .contains(bottomColor);
            }

            if (shoeColor.equals("Brown")) {
                return Set.of("Beige", "Navy Blue", "Grey", "Blue", "White")
                        .contains(bottomColor);
            }
        }

        if (shoeCategory.equals("Loafers")) {
            return Set.of("Beige", "Navy Blue", "Blue", "Black", "White")
                    .contains(bottomColor);
        }

        if (shoeCategory.equals("Sneakers")) {

            if (shoeColor.equals("White")) {
                return Set.of("Blue", "Black", "Navy Blue", "Beige", "White")
                        .contains(bottomColor);
            }

            return true;
        }

        if (shoeCategory.equals("Sandals")) {
            return true;
        }

        return false;
    }

    // Select suitable outerwear when needed
    private List<Clothing> getSuitableAccessories(
            List<Clothing> matchingClothes,
            int temperature) {

        List<Clothing> accessories = new ArrayList<>();

        if (temperature > 22) {
            return accessories;
        }

        for (Clothing clothing : matchingClothes) {

            String category = clothing.getCategory();

            if (category.equals("Jacket")
                    || category.equals("Hoodie")
                    || category.equals("Sweater")
                    || category.equals("Blazer")) {

                accessories.add(clothing);
                break;
            }
        }

        return accessories;
    }

    // Generate explanation for the recommended outfit
    private String createReason(
            Clothing top,
            Clothing bottom,
            Clothing shoes,
            Occasion occasion,
            Weather weather,
            int temperature) {

        String reason = "This outfit is suitable for "
                + occasion.name().toLowerCase().replace("_", "/")
                + " with "
                + weather.name().toLowerCase()
                + " weather. ";

        reason += top.getColor() + " " + top.getCategory()
                + " matches well with "
                + bottom.getColor() + " " + bottom.getCategory()
                + ". ";

        reason += shoes.getName()
                + " completes the outfit. ";

        reason += "The selected clothes are suitable for "
                + temperature + "°C temperature.";

        return reason;
    }
}
