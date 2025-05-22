package org.example.Adoption;

import org.example.Pet.Animal;
import org.example.User.Owner.Owner;
import org.example.User.Staff.AdoptionEmployee;

public class AdoptionTicket {
    private Adoption adoption;

    public AdoptionTicket(Adoption adoption) {
        this.adoption = adoption;
    }

    public String generateTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("=== ADOPTION TICKET ===\n\n");
        
        // Owner Information
        Owner owner = adoption.getOwner();
        ticket.append("Owner Information:\n");
        ticket.append("Name: ").append(owner.getName()).append("\n");
        ticket.append("Age: ").append(owner.getAge()).append("\n");
        ticket.append("Address: ").append(owner.getAddress()).append("\n\n");
        
        // Pet Information
        Animal pet = adoption.getPet();
        ticket.append("Pet Information:\n");
        ticket.append("Name: ").append(pet.getName()).append("\n");
        ticket.append("Breed: ").append(pet.getBreed().getName()).append("\n");
        ticket.append("Weight: ").append(pet.getWeight()).append(" kg\n\n");
        
        // Employee Information
        AdoptionEmployee employee = adoption.getEmployee();
        ticket.append("Adoption Processed By:\n");
        ticket.append("Employee Name: ").append(employee.getName()).append("\n\n");
        
        // Adoption Date
        ticket.append("Adoption Date: ").append(adoption.getAdoptionDate()).append("\n\n");
        
        // Care Recommendations
        ticket.append("=== CARE RECOMMENDATIONS ===\n");
        ticket.append(pet.getBreed().getCareRecommendations(pet));
        
        return ticket.toString();
    }
} 