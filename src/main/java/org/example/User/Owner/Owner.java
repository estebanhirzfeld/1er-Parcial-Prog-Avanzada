package org.example.User.Owner;

import org.example.User.User;

public class Owner extends User {
    private String address;

    public Owner(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String getRole() {
        return "Pet Owner";
    }
}
