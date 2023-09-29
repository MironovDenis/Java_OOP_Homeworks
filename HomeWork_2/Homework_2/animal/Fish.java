package animal;


import VetClinic.Illable;

public class Fish extends Animal implements Swimable, Illable {


    public Fish(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void swim() {

    }

    @Override
    public double getSwimSpeed() {
        return 50;
    }

    @Override
    public void getIll() {

    }
}
