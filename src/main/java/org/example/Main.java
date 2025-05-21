package org.example;

import java.util.Date;

import org.example.Pet.Animal;
import org.example.Pet.Breed;
import org.example.Pet.GermanShepherd;


public class Main {
    public static void main(String[] args) {
        // Create a German Shepherd breed with dog care strategy
        // Create a German Shepherd
        Breed germanShepherd = new GermanShepherd();

        // Create an animal
        Animal dog = new Animal("Rex", new Date(), 35.0, germanShepherd);

        // Get recommendations
        System.out.println(germanShepherd.getCareRecommendations(dog));
    }
}