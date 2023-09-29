import VetClinic.Illable;
import VetClinic.VeterinaryClinic;
import animal.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic allAnimals = new VeterinaryClinic();
        allAnimals.addAnimal(new Bug("Жора", 0.1, "черный"));
        allAnimals.addAnimal(new Dog("Бобик"));
        allAnimals.addAnimal(new Cat("Пушок", 6.0, "белый"));
        allAnimals.addAnimal(new Duck("Дональд", 3.8, "серый"));
        allAnimals.addAnimal(new Fish("Дори", 1.0, "синяя"));
        allAnimals.addAnimal(new Hummingbird("Хуми", 0.5, "разноцветная"));

        System.out.println("Животные в клинике: ");
        for (Animal animal: allAnimals.getAnimals()){
            System.out.println(animal.getTYPE()+ " " + animal.getName());
        }

        System.out.println("\nБегающие животные: ");
        for (Runable running: allAnimals.getRunningAnimals()) {
            running.run();
            System.out.println(" со скоростью " + running.getRunSpeed() + " км/ч");
        }

        System.out.println("\nПлавающие животные: ");
        for (Swimable swiming: allAnimals.getSwimingAnimals()) {
            swiming.swim();
            System.out.println(" со скоростью " + swiming.getSwimSpeed() + " км/ч");
        }

        System.out.println("\nЛетающие животные: ");
        for (Flyable flying: allAnimals.getFlyingAnimals()) {
            flying.fly();
            System.out.println(" со скоростью " + flying.getFlySpeed() + " км/ч");
        }

        System.out.println("\nГоворящие животные: ");
        for (Speakable speaking: allAnimals.getSpeakingAnimals()) {
            speaking.speak();
        }

        System.out.println("\nБольные животные: ");
        for (Illable illing: allAnimals.getIllingAnimals()) {
            illing.getIll();
        }

    }
}
