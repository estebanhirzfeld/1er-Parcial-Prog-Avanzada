package org.example.Pet;

import java.util.Date;
import java.util.Calendar;
import org.example.Pet.Breed.Breed;

public class Animal implements AnimalInterface {
    private String name;
    private Date birthDate;
    private Double weight;
    private Breed breed;

    public Animal(String name, Date birthDate, Double weight, Breed breed) {
        this.name = name;
        this.birthDate = birthDate;
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public Double getWeight() {
        return weight;
    }

    @Override
    public Breed getBreed() {
        return breed;
    }

    @Override
    public int getAge() {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        
        // Already had birthday this year?
        if (birth.get(Calendar.MONTH) > today.get(Calendar.MONTH) || 
            (birth.get(Calendar.MONTH) == today.get(Calendar.MONTH) && 
             birth.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        
        return age;
    }

    @Override
    public String getCareRecommendations() {
        return breed.getCareRecommendations(this);
    }
}
