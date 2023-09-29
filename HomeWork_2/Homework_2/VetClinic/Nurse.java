package VetClinic;

import java.util.List;

public class Nurse extends Medical{

    public Nurse(String name, String sex, int age) {
        super(name, sex, age);

    }

    public void getHelp(){
        System.out.println("Медсестра Мэри выполняет лечебные процедуры.");
    }

}
