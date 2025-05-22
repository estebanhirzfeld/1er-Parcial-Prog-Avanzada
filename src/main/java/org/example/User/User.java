package org.example.User;

public abstract class User implements UserInterface {
    private String name;
    private int age;

    protected User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public abstract String getRole();
} 