package Homework_Aminal;

public class Parrot extends Animal {

    public Parrot(String location, String food) {
        super(location, food);
    }

    String S = "что-то на попугайном";
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
        super.eat();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Кар-кря");
    }

    public void makeNoise(String S) { //он не работает почему-то
        super.makeNoise();
        System.out.println(S);
    }
}
