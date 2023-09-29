package animal;


import VetClinic.Illable;

public class Duck extends Animal implements Flyable, Swimable, Runable, Speakable, Illable {


    public Duck(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " летит");

    }

    @Override
    public double getFlySpeed() {
        return 40;
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
    public void run() {
        System.out.println(this.TYPE + " бежит");

    }

    @Override
    public double getRunSpeed() {
        return 2;
    }



    @Override
    public void speak() {
        System.out.println(this.TYPE + " говорит Кря!");
    }

    @Override
    public void getIll() {
        System.out.println(this.TYPE + " болеет");

    }
}
