package homework;

public class Sun {
    public static int count = 0;
    public static int Sunrise;

    public Sun(int Sunrise) {
        this.Sunrise = Sunrise;
        count++;
    }

    public static void main(String[] args) {
        Sun Sunrise1 = new Sun(1);
        Sun Sunrise2 = new Sun(1);
        Sun Sunrise3 = new Sun(1);
        System.out.println("Sunrise was " + count + " times");
    }
}


