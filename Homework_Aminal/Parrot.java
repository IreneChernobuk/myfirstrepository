package Homework_Aminal;

public class Parrot extends Animal {
    String s = "что-то на попугайном";
    public Parrot(String location, String food) {
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
    public void eat() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Кар-кря");
    }

    public void makeNoise(String s) {
        System.out.println(s);
    }
}
