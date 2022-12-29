package Homework_Aminal;

public class Horse extends Animal {

    public Horse(String location, String food) {
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
        System.out.println("И-го-го");
    }
}
