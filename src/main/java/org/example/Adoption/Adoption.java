package org.example.Adoption;

import java.util.Date;

import org.example.Pet.Animal;
import org.example.User.Owner.Owner;
import org.example.User.Staff.AdoptionEmployee;

public class Adoption {
    private Owner owner;
    private Animal pet;
    private AdoptionEmployee employee;
    private Date adoptionDate;

    public Adoption(Owner owner, Animal pet, AdoptionEmployee employee, Date adoptionDate) {
        this.owner = owner;
        this.pet = pet;
        this.employee = employee;
        this.adoptionDate = adoptionDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public Animal getPet() {
        return pet;
    }

    public AdoptionEmployee getEmployee() {
        return employee;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }
} 