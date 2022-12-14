package homework_abstr_inter;

public class Test_interface {
    public static void main(String[] args) {
        Printable [] print = new Printable[6];
        print[0] = new Book("к себе нежно", "Ольга Примарченко");
        print[1] = new Book("Гарри Поттер", "Джоан Роулинг");
        print[2] = new Book("Думай и богатей", "Наполеон Хилл");
        print[3] = new Magazine("Burda", 1, 2022);
        print[4] = new Magazine("Выкройка",7, 1987);
        print[5] = new Magazine("Vogue", 5, 2021);

        for (Printable printing:
                print) {
            printing.print();
        }
    }
}
