package Homework_Aminal;

public class Veterinarian {

    void treatAnimal(Animal animal){
        animal.makeNoise();
        System.out.println("моя еда: " + animal.getFood() + " и я живу: " + animal.getLocation());
    }
}
