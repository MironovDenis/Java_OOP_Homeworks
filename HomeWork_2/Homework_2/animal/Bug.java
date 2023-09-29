package animal;

public class Bug extends Animal implements Runable, Flyable{
        public Bug(String name) {
        super(name);

    }


    @Override
    public void run() {
        System.out.println(this.TYPE + " бежит");

    }

    @Override
    public double getRunSpeed() {
        return 1;
    }


    @Override
    public void fly() {
        System.out.println(this.TYPE + " летит");

    }

    @Override
    public double getFlySpeed() {
        return 18;
    }
}
