package homework_abstr_inter;

public class Book implements Printable{
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга " + name + " автора " + author);
    }

}
