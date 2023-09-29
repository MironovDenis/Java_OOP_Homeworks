package VetClinic;

import animal.*;

import java.util.ArrayList;
import java.util.List;

public final class VeterinaryClinic {
    private List<Animal> animals;
    public VeterinaryClinic(){
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public List<Runable> getRunningAnimals() {
        List<Runable> runningAnimals = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Runable) runningAnimals.add((Runable) animal);
        }
        return runningAnimals;
    }

    public List<Swimable> getSwimingAnimals() {
        List<Swimable> swimingAnimals = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Swimable) {
                swimingAnimals.add((Swimable) animal);
            }
        }
        return swimingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Flyable) {
                flyingAnimals.add((Flyable) animal);
            }
        }
        return flyingAnimals;
    }

    public List<Speakable> getSpeakingAnimals() {
        List<Speakable> speakingAnimals = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Speakable) {
                speakingAnimals.add((Speakable) animal);
            }
        }
        return speakingAnimals;
    }

    public List<Illable> getIllingAnimals() {
        List<Illable> illingAnimals = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Illable) {
                illingAnimals.add((Illable) animal);
            }
        }
        return illingAnimals;
    }
}
