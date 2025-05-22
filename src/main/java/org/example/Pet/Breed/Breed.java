package org.example.Pet.Breed;

import org.example.Pet.Animal;

public class Breed {
    private String name;
    private BreedRecommendation recommendation;
    private boolean isCommonBreed;

    // Common breeds
    protected Breed(String name) {
        this.name = name;
        this.isCommonBreed = true;
        this.recommendation = new BreedRecommendation(name);
    }

    // Custom breeds
    public static Breed createCustomBreed(String name, BreedRecommendation recommendation) {
        Breed breed = new Breed(name);
        breed.isCommonBreed = false;
        breed.recommendation = recommendation;
        return breed;
    }

    public String getName() {
        return name;
    }

    public BreedRecommendation getRecommendation() {
        return recommendation;
    }

    public boolean isCommonBreed() {
        return isCommonBreed;
    }

    public String getCareRecommendations(Animal animal) {
        return recommendation.getCompleteRecommendations(animal);
    }
}
