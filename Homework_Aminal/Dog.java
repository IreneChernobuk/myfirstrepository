package Homework_Aminal;

public class Dog extends Animal{
    public Dog(String location, String food) {
        super(location, food);
    }
    private String name;

    @Override
    public String getFood() {
        return super.getFood();
    }
    @Override
    public String getLocation() {
        return super.getLocation();
    }
    @Override
    public void makeNoise() {
        System.out.println("Гав! Гав!");
    }
    @Override
    public void eat() {
        System.out.println("покорми меня, хозяин");
    }
}
