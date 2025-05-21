package org.example.Pet;

public class GermanShepherd extends Breed {
    public GermanShepherd() {
        super("German Shepherd");
    }

    @Override
    protected String getBreedSpecificFoodRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("\nGerman Shepherd specific food recommendations:\n");
        recommendation.append("- Use large breed puppy food for proper joint development\n");
        recommendation.append("- Consider adding glucosamine supplements from early age\n");
        recommendation.append("- Feed from elevated bowls to prevent bloat\n");
        recommendation.append("- Avoid foods with high calcium content\n");
        return recommendation.toString();
    }

    @Override
    protected String getBreedSpecificWalkRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("\nGerman Shepherd specific exercise recommendations:\n");
        recommendation.append("- Include mental stimulation activities (obedience training, puzzle toys)\n");
        recommendation.append("- Avoid excessive jumping in young dogs to protect joints\n");
        recommendation.append("- Consider agility training for mental and physical exercise\n");
        recommendation.append("- Regular socialization with other dogs\n");
        return recommendation.toString();
    }

    @Override
    protected String getBreedSpecificHealthRecommendation(Animal animal) {
        StringBuilder recommendation = new StringBuilder();
        recommendation.append("\nGerman Shepherd specific health recommendations:\n");
        recommendation.append("- Regular hip and elbow screening (common in the breed)\n");
        recommendation.append("- Monitor for degenerative myelopathy\n");
        recommendation.append("- Regular grooming to manage shedding\n");
        recommendation.append("- Watch for signs of bloat (GDV)\n");
        return recommendation.toString();
    }
} 