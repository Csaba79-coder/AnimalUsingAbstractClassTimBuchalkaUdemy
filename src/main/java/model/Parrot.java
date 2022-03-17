package model;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    // down bellow it inherits automatically from the interface through bird class!
    /*@Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }*/
}
