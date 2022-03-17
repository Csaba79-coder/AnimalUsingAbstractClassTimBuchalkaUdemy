package model;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    // we live it this way, as we want to override the original method, as Penguin is not able to fly ...
    // we want to implement some speciality here in Penguin class, not using the origin version!!!
    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
