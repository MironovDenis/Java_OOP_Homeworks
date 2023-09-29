package animal;

import VetClinic.Illable;

public class Dog extends Animal implements Runable, Swimable, Speakable, Illable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.TYPE + " бежит");
    }

    @Override
    public double getRunSpeed() {
        return 50;
    }

    @Override
    public void swim() {
        System.out.println(this.TYPE + " плывет");
    }

    @Override
    public double getSwimSpeed() {
        return 5;
    }


    @Override
    public void speak() {
        System.out.println(this.TYPE + " говорит Гав!");
    }

    @Override
    public void getIll() {
        System.out.println(this.TYPE + " болеет");

    }
}