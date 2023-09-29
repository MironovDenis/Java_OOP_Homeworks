package animal;

import VetClinic.Illable;

public class Cat extends Animal implements Runable, Swimable, Speakable, Illable {
    public Cat(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void run() {
        System.out.println(this.TYPE + " бежит");

    }

    @Override
    public double getRunSpeed() {
        return 55;
    }


    @Override
    public void swim() {
        System.out.println(this.TYPE + " плывет");
    }

    @Override
    public double getSwimSpeed() {
        return 3;
    }


    @Override
    public void speak() {
        System.out.println(this.TYPE + " говорит Мяу!");
    }

    @Override
    public void getIll() {
        System.out.println(this.TYPE + " болеет");

    }
}
