package model;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    // public abstract void fly(); // <-- we have instead of it the CanFly interface that we implemented!


    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
