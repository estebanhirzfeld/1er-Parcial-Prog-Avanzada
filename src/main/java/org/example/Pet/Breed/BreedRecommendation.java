package org.example.Pet.Breed;

import org.example.Pet.Animal;

public class BreedRecommendation {
    private String breedName;
    private String foodRecommendation;
    private String walkRecommendation;
    private String healthRecommendation;

    public BreedRecommendation(String breedName) {
        this.breedName = breedName;
    }

    public void setFoodRecommendation(String foodRecommendation) {
        this.foodRecommendation = foodRecommendation;
    }

    public void setWalkRecommendation(String walkRecommendation) {
        this.walkRecommendation = walkRecommendation;
    }

    public void setHealthRecommendation(String healthRecommendation) {
        this.healthRecommendation = healthRecommendation;
    }

    public String getBreedName() {
        return breedName;
    }

    public String getFoodRecommendation() {
        return foodRecommendation;
    }

    public String getWalkRecommendation() {
        return walkRecommendation;
    }

    public String getHealthRecommendation() {
        return healthRecommendation;
    }

    public String getGeneralFoodRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("Food recommendations for ").append(animal.getName()).append(":\n");
        
        if (animal.getAge() < 1) {
            recommendation.append("- Feed 3-4 times daily with appropriate food for young animals\n");
        } else if (animal.getAge() < 7) {
            recommendation.append("- Feed 2 times daily with adult food\n");
        } else {
            recommendation.append("- Feed 2 times daily with senior food\n");
        }

        if (animal.getWeight() > 20.0) {
            recommendation.append("- Consider weight management formula\n");
        }

        if (this.foodRecommendation != null) {
            recommendation.append(this.foodRecommendation);
        }

        return recommendation.toString();
    }

    public String getGeneralWalkRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("Exercise recommendations for ").append(animal.getName()).append(":\n");
        
        if (animal.getAge() < 1) {
            recommendation.append("- Multiple short exercise sessions daily\n");
        } else if (animal.getAge() < 7) {
            recommendation.append("- Regular exercise sessions\n");
        } else {
            recommendation.append("- Gentle exercise sessions\n");
        }

        if (this.walkRecommendation != null) {
            recommendation.append(this.walkRecommendation);
        }

        return recommendation.toString();
    }

    public String getGeneralHealthRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("Health recommendations for ").append(animal.getName()).append(":\n");
        
        if (animal.getAge() < 1) {
            recommendation.append("- Monthly vet check-ups\n");
            recommendation.append("- Complete vaccination schedule\n");
        } else if (animal.getAge() < 7) {
            recommendation.append("- Annual vet check-ups\n");
            recommendation.append("- Regular vaccination boosters\n");
        } else {
            recommendation.append("- Bi-annual vet check-ups\n");
            recommendation.append("- Senior health screening\n");
        }

        if (this.healthRecommendation != null) {
            recommendation.append(this.healthRecommendation);
        }

        return recommendation.toString();
    }

    public String getCompleteRecommendations(Animal animal) {
        StringBuilder recommendations = new StringBuilder();
        recommendations.append("Care recommendations for ").append(animal.getName())
                      .append(" (").append(this.breedName).append("):\n\n");
        
        recommendations.append(getGeneralFoodRecommendation(animal)).append("\n");
        recommendations.append(getGeneralWalkRecommendation(animal)).append("\n");
        recommendations.append(getGeneralHealthRecommendation(animal));
        
        return recommendations.toString();
    }
} 