package Homework_Aminal;

public class Cat extends Animal{
    public Cat(String location, String food) {
        super(location, food);
    }
    private String name;
    @Override
    public String getLocation() {
        return super.getLocation();
    }
    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мур- Мяу");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("покорми меня");
    }
}
