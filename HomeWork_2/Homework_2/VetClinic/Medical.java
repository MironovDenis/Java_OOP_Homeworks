package VetClinic;

public abstract class Medical {
    private String name;
    private String sex;
    private int age;

    public Medical(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

}
