package homework;

public class ListOfStudents {
    public static int min = 4;
    public static int max = 10;
    public static int sum;


    public static void main(String[] args) {
        Student lili = new Student("Lili", 1,(int)(Math.random()*(max-min+1)+min));
        lili.displayInfo();
        Student anna = new Student("Anna", 3,(int)(Math.random()*(max-min+1)+min));
        anna.displayInfo();
        Student semen = new Student("Semen", 1,(int)(Math.random()*(max-min+1)+min));
        semen.displayInfo();
        Student sasha = new Student("Sasha", 2,(int)(Math.random()*(max-min+1)+min));
        sasha.displayInfo();
        Student egor = new Student("Egor", 2,(int)(Math.random()*(max-min+1)+min));
        egor.displayInfo();
        Student oliver = new Student("Oliver", 3,(int)(Math.random()*(max-min+1)+min));
        oliver.displayInfo();

        int [] grades = {lili.grade, anna.grade, semen.grade, sasha.grade, egor.grade, oliver.grade};
        for (int i:
                grades) {
            sum += i;
        }
        int result = sum /grades.length;
        System.out.println("Average student grade: " + result);
    }
}
