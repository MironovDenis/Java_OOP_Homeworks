package animal;



public class Hummingbird extends Animal implements Flyable, Speakable{


    public Hummingbird(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " летит");

    }

    @Override
    public double getFlySpeed() {
        return 60;
    }


    @Override
    public void speak() {
        System.out.println(this.TYPE + " говорит Чирик!");
    }
}
