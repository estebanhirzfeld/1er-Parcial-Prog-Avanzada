package org.example.Pet.Breed.Common;

import org.example.Pet.Breed.Breed;
import org.example.Pet.Breed.BreedRecommendation;

public class GermanShepherd extends Breed {
    public GermanShepherd() {
        super("German Shepherd");
        setupRecommendations();
    }

    private void setupRecommendations() {
        BreedRecommendation recommendation = getRecommendation();
        
        // Food recommendations
        StringBuilder foodRec = new StringBuilder();
        foodRec.append("\nGerman Shepherd specific food recommendations:\n");
        foodRec.append("- Use large breed puppy food for proper joint development\n");
        foodRec.append("- Consider adding glucosamine supplements from early age\n");
        foodRec.append("- Feed from elevated bowls to prevent bloat\n");
        foodRec.append("- Avoid foods with high calcium content\n");
        recommendation.setFoodRecommendation(foodRec.toString());

        // Walk recommendations
        StringBuilder walkRec = new StringBuilder();
        walkRec.append("\nGerman Shepherd specific exercise recommendations:\n");
        walkRec.append("- Include mental stimulation activities (obedience training, puzzle toys)\n");
        walkRec.append("- Avoid excessive jumping in young dogs to protect joints\n");
        walkRec.append("- Consider agility training for mental and physical exercise\n");
        walkRec.append("- Regular socialization with other dogs\n");
        recommendation.setWalkRecommendation(walkRec.toString());

        // Health recommendations
        StringBuilder healthRec = new StringBuilder();
        healthRec.append("\nGerman Shepherd specific health recommendations:\n");
        healthRec.append("- Regular hip and elbow screening (common in the breed)\n");
        healthRec.append("- Monitor for degenerative myelopathy\n");
        healthRec.append("- Regular grooming to manage shedding\n");
        healthRec.append("- Watch for signs of bloat (GDV)\n");
        recommendation.setHealthRecommendation(healthRec.toString());
    }
} 