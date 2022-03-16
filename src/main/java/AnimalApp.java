import model.Bird;
import model.Dog;
import model.Parrot;
import model.Penguin;

public class AnimalApp {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        System.out.println("------------");
        Bird bird = new Parrot("Parrot");
        bird.breathe();
        bird.eat();
        bird.fly();
        System.out.println("------------");
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        System.out.println("------------");
        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
        System.out.println("------------");
    }
}
