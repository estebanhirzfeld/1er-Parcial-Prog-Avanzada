package org.example.Pet;

public class Breed {
    private String name;

    public Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCareRecommendations(Animal animal) {
        StringBuilder recommendations = new StringBuilder();
        recommendations.append("Care recommendations for ").append(animal.getName())
                      .append(" (").append(this.name).append("):\n\n");
        
        recommendations.append(getFoodRecommendation(animal)).append("\n");
        recommendations.append(getWalkRecommendation(animal)).append("\n");
        recommendations.append(getHealthRecommendation(animal));
        
        return recommendations.toString();
    }

    protected String getFoodRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("Food recommendations for ").append(animal.getName()).append(":\n");
        
        if (animal.getAge() < 1) {
            recommendation.append("- Feed 3-4 times daily with appropriate food for young animals\n");
        } else if (animal.getAge() < 7) {
            recommendation.append("- Feed 2 times daily with adult food\n");
        } else {
            recommendation.append("- Feed 2 times daily with senior food\n");
        }

        // Add breed-specific recommendations
        recommendation.append(getBreedSpecificFoodRecommendation(animal));

        if (animal.getWeight() > 20.0) {
            recommendation.append("- Consider weight management formula\n");
        }

        return recommendation.toString();
    }

    protected String getWalkRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("Exercise recommendations for ").append(animal.getName()).append(":\n");
        
        if (animal.getAge() < 1) {
            recommendation.append("- Multiple short exercise sessions daily\n");
        } else if (animal.getAge() < 7) {
            recommendation.append("- Regular exercise sessions\n");
        } else {
            recommendation.append("- Gentle exercise sessions\n");
        }

        // Add breed-specific recommendations
        recommendation.append(getBreedSpecificWalkRecommendation(animal));

        return recommendation.toString();
    }

    protected String getHealthRecommendation(Animal animal) {
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

        // Add breed-specific recommendations
        recommendation.append(getBreedSpecificHealthRecommendation(animal));

        return recommendation.toString();
    }

    // These methods should be overridden by specific breed classes
    protected String getBreedSpecificFoodRecommendation(Animal animal) {
        return "";
    }

    protected String getBreedSpecificWalkRecommendation(Animal animal) {
        return "";
    }

    protected String getBreedSpecificHealthRecommendation(Animal animal) {
        return "";
    }
}
