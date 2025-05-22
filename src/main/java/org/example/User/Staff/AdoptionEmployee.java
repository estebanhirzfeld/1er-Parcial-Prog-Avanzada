package org.example.User.Staff;

import org.example.User.User;

//Singleton AdoptionEmployee
public class AdoptionEmployee extends User {
    private static AdoptionEmployee instance;

    private AdoptionEmployee(String name, int age) {
        super(name, age);
    }

    public static AdoptionEmployee getInstance(String name, int age) {
        if (instance == null) {
            instance = new AdoptionEmployee(name, age);
        }
        return instance;
    }

    public static AdoptionEmployee getInstance() {
        if (instance == null) {
            throw new IllegalStateException("AdoptionEmployee must be initialized first");
        }
        return instance;
    }

    @Override
    public String getRole() {
        return "Adoption Employee";
    }
}
