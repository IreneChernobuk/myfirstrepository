package homework;

public class Stringtask {
    public static void main(String[] args) {
        String name = "I like Java";
        System.out.println(name.substring(10)); //печать последнего символа
        System.out.println(name.contains("Java"));  //проверка содержит ли "Java'
        System.out.println(name.replace("a", "o")); //замена "а" на "о"
        System.out.println(name.toUpperCase()); //верхний регистр
        System.out.println(name.toLowerCase()); //нижний регистр
        System.out.println(name.substring(0,7)); //печать первых 7 символов

        String cake = "корж %s корж";
        System.out.println(String.format(cake, "крем")); //форматирование строки cake
    }
}
