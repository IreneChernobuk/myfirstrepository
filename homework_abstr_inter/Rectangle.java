package homework_abstr_inter;

public class Rectangle extends Figure{

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void square() {
        int s = x * y;
        System.out.println(s);
    }

    @Override
    public void perimeter() {
        int p = 2 * (x+y);
        System.out.println(p);
    }
}