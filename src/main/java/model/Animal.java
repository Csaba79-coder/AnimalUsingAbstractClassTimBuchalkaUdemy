package model;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // these abstract methods must be implemented!
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
