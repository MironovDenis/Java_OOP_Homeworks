package animal;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected String color;
    protected final String TYPE = this.getClass().getSimpleName();

    public Animal(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
