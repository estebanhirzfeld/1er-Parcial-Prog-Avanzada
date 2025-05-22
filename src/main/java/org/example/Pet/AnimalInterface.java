package org.example.Pet;

import java.util.Date;
import org.example.Pet.Breed.Breed;

public interface AnimalInterface {
    String getName();
    Date getBirthDate();
    Double getWeight();
    Breed getBreed();
    int getAge();
    String getCareRecommendations();
}
