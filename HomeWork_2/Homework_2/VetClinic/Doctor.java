package VetClinic;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Medical implements Healable{
    private List<Animal> patients;
    private String nurse;
    public Doctor(String name, String sex, int age) {
        super(name, sex, age);
        patients = new ArrayList<>();
    }

    public Doctor(String name, String sex, int age, String nurse) {
        super(name, sex, age);
        this.nurse = nurse;
    }

    public void callNurse(){
        System.out.println("Доктор зовет медсестру.");
    }

    @Override
    public void heal(Animal animal) {
        System.out.println("Доктор " + this.getName() + " лечит " + animal.getTYPE() + ".");
    }
}
