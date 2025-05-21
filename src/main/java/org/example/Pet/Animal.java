package org.example.Pet;

import java.util.Date;
import java.util.Calendar;

public class Animal {
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

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        
        // Adjust age if birthday hasn't occurred this year
        if (birth.get(Calendar.MONTH) > today.get(Calendar.MONTH) || 
            (birth.get(Calendar.MONTH) == today.get(Calendar.MONTH) && 
             birth.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        
        return age;
    }

    public char[] getCareRecommendations(Animal persianCat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCareRecommendations'");
    }
}
