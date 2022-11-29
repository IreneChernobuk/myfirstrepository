package homework;

public class Student {
        public String name;
        public int group;
        public int grade;
        public Student(String name, int group, int grade) {
            this.name = name;
            this.group = group;
            this.grade = grade;
        }
        public void displayInfo() {
            System.out.println("Student's name: " + name + "\nStudent's group: " + group + "\nStudent's grade: " + grade);
        }

}
