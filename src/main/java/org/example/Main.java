package org.example;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.example.Adoption.Adoption;
import org.example.Adoption.AdoptionTicket;
import org.example.Pet.Animal;
import org.example.Pet.Breed.Breed;
import org.example.Pet.Breed.BreedRecommendation;
import org.example.Pet.Breed.Common.GermanShepherd;
import org.example.Pet.Breed.Common.Persian;
import org.example.User.Owner.Owner;
import org.example.User.Staff.AdoptionEmployee;

public class Main {

    private static Breed createMixedBreed() {
        BreedRecommendation mixedBreedRec = new BreedRecommendation("Mixed Breed");
        StringBuilder foodRec = new StringBuilder();
        foodRec.append("\nMixed Breed specific food recommendations:\n");
        foodRec.append("- Use high-quality balanced diet\n");
        foodRec.append("- Monitor weight and adjust portions accordingly\n");
        foodRec.append("- Consider breed-specific needs based on dominant traits\n");
        mixedBreedRec.setFoodRecommendation(foodRec.toString());

        StringBuilder walkRec = new StringBuilder();
        walkRec.append("\nMixed Breed specific exercise recommendations:\n");
        walkRec.append("- Regular exercise based on size and energy level\n");
        walkRec.append("- Monitor for any breed-specific exercise needs\n");
        walkRec.append("- Adjust activity level based on individual characteristics\n");
        mixedBreedRec.setWalkRecommendation(walkRec.toString());

        StringBuilder healthRec = new StringBuilder();
        healthRec.append("\nMixed Breed specific health recommendations:\n");
        healthRec.append("- Regular health check-ups\n");
        healthRec.append("- Monitor for any breed-specific health concerns\n");
        healthRec.append("- Consider genetic testing if breed mix is unknown\n");
        mixedBreedRec.setHealthRecommendation(healthRec.toString());

        Breed mixedBreed = Breed.createCustomBreed("Mixed Breed", mixedBreedRec);
        return mixedBreed;
    }
    public static void main(String[] args) {
        // Initialize the adoption employee (Singleton)
        AdoptionEmployee employee = AdoptionEmployee.getInstance("Max Power", 35);
        
        // Create standard breeds 
        Breed germanShepherd = new GermanShepherd();
        Breed persian = new Persian();

        // Create a custom breed (Mixed Breed)
        Breed mixedBreed = createMixedBreed();

        // Create animals
        Animal germanShepherdDog = new Animal("Rex", new Date(), 35.0, germanShepherd);
        Animal persianCat = new Animal("Luna", new Date(), 4.5, persian);
        Animal mixed = new Animal("Buddy", new Date(), 15.0, mixedBreed);

        // Create owners
        Owner dogOwner = new Owner("Tony Montana", 28, "123 Main St");
        Owner catOwner = new Owner("John Locke", 35, "456 Oak Ave");
        Owner mixedOwner = new Owner("Al Capone", 42, "789 Pine Rd");

        // Get current date
        Date currentDate = new Date();

        // Create adoptions
        Adoption dogAdoption = new Adoption(dogOwner, germanShepherdDog, employee, currentDate);
        Adoption catAdoption = new Adoption(catOwner, persianCat, employee, currentDate);
        Adoption mixedAdoption = new Adoption(mixedOwner, mixed, employee, currentDate);

        // Generate and display adoption tickets
        System.out.println("=== German Shepherd Adoption ===");
        System.out.println(new AdoptionTicket(dogAdoption).generateTicket());
        
        System.out.println("\n=== Persian Cat Adoption ===");
        System.out.println(new AdoptionTicket(catAdoption).generateTicket());
        
        System.out.println("\n=== Mixed Breed Adoption ===");
        System.out.println(new AdoptionTicket(mixedAdoption).generateTicket());
    }
}