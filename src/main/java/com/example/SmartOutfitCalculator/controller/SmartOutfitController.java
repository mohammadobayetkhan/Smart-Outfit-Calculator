
package com.example.SmartOutfitCalculator.controller;

import com.example.SmartOutfitCalculator.service.OutfitService;
import com.example.SmartOutfitCalculator.enums.Occasion;
import com.example.SmartOutfitCalculator.enums.Weather;
import com.example.SmartOutfitCalculator.enums.Style;
import com.example.SmartOutfitCalculator.model.Outfit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SmartOutfitController {

    private final OutfitService outfitService;

    // Constructor-Based Dependency Injection
    public SmartOutfitController(OutfitService outfitService) {
        this.outfitService = outfitService;
    }

    // Generate outfit recommendations
    @PostMapping("/recommend")
    public String recommend(
            @RequestParam String occasion,
            @RequestParam String weather,
            @RequestParam int temperature,
            Model model) {

        Occasion selectedOccasion;

        if (occasion.equalsIgnoreCase("Viva/Interview")) {
            selectedOccasion = Occasion.VIVA_INTERVIEW;
        } else {
            selectedOccasion = Occasion.valueOf(
                    occasion.toUpperCase()
            );
        }

        Weather selectedWeather =
                Weather.valueOf(weather.toUpperCase());

        Style selectedStyle;

        // Automatically select outfit style
        switch (selectedOccasion) {

            case UNIVERSITY:
            case CASUAL:
                selectedStyle = Style.CASUAL;
                break;

            case OFFICE:
            case VIVA_INTERVIEW:
                selectedStyle = Style.FORMAL;
                break;

            case PARTY:
            case WEDDING:
                selectedStyle = Style.TRADITIONAL;
                break;

            default:
                selectedStyle = Style.CASUAL;
        }

        List<Outfit> outfits = outfitService.generateOutfits(
                selectedOccasion,
                selectedWeather,
                temperature,
                selectedStyle
        );

        model.addAttribute("outfits", outfits);

        return "result";
    }
}
