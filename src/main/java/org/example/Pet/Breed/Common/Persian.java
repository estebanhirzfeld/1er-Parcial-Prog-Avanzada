package org.example.Pet.Breed.Common;

import org.example.Pet.Breed.Breed;
import org.example.Pet.Breed.BreedRecommendation;

public class Persian extends Breed {
    public Persian() {
        super("Persian");
        setupRecommendations();
    }

    private void setupRecommendations() {
        BreedRecommendation recommendation = getRecommendation();
        
        // Food recommendations
        StringBuilder foodRec = new StringBuilder();
        foodRec.append("\nPersian cat specific food recommendations:\n");
        foodRec.append("- Use high-quality dry food to help maintain dental health\n");
        foodRec.append("- Consider wet food occasionally to increase water intake\n");
        foodRec.append("- Feed in a clean, elevated bowl to prevent whisker stress\n");
        foodRec.append("- Monitor weight as Persians are prone to obesity\n");
        recommendation.setFoodRecommendation(foodRec.toString());

        // Walk recommendations
        StringBuilder walkRec = new StringBuilder();
        walkRec.append("\nPersian cat specific exercise recommendations:\n");
        walkRec.append("- Provide interactive toys for indoor exercise\n");
        walkRec.append("- Regular play sessions to maintain activity levels\n");
        walkRec.append("- Consider cat trees and climbing structures\n");
        walkRec.append("- Keep exercise gentle due to brachycephalic face structure\n");
        recommendation.setWalkRecommendation(walkRec.toString());

        // Health recommendations
        StringBuilder healthRec = new StringBuilder();
        healthRec.append("\nPersian cat specific health recommendations:\n");
        healthRec.append("- Daily grooming to prevent matting\n");
        healthRec.append("- Regular eye cleaning due to tear staining\n");
        healthRec.append("- Monitor for breathing difficulties\n");
        healthRec.append("- Regular dental care due to brachycephalic structure\n");
        recommendation.setHealthRecommendation(healthRec.toString());
    }
} 