package main;


public final class User {
    final String name;
    final String surname;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
