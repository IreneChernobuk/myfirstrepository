package homework_abstr_inter;

abstract class Figure {
    public int x;
    public int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void square();
    public abstract void perimeter();
}
