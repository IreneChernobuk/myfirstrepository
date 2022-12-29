package Homework_Aminal;

public class Test {

    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian(); //экземпляр класса
        Animal[] animals = new Animal[4]; //создаем массив
        animals[0] = new Dog("будка", "косточка");
        animals[1] = new Cat("квартира", "корм кошачий");
        animals[2] = new Horse("хлев", "сено");
        animals[3] = new Parrot("Клетка", "зерно");

        for (Animal animal :
                animals) {
            vet.treatAnimal(animal);
            animal.eat();
        }
    }
}

