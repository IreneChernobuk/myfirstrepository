package homework_abstr_inter;

public class Magazine implements Printable{
    public String name;
    public int number_publish;
    public int year;

    public Magazine(String name, int number_publish, int year) {
        this.name = name;
        this.number_publish = number_publish;
        this.year = year;
    }
    @Override
    public void print() {
        System.out.println("Журнал " + name + " (номер выпуска № " + number_publish + ") " + year + " года");
    }
}