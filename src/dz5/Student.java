package dz5;

public class Student {
    private int id;
    private String name;
    private String lastname;
    private int course;
    private double avgMathGrade;
    private double avgEcoGrade;
    private double avgEngGrade;

    public Student(int id, String name, String lastname, int course, double avgMathGrade, double avgEcoGrade, double avgEngGrade) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.course = course;
        this.avgMathGrade = avgMathGrade;
        this.avgEcoGrade = avgEcoGrade;
        this.avgEngGrade = avgEngGrade;
    }

    public Student(int id, String name, String lastname, int course) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.course = course;
    }

    public Student() {

    }

    public double getAvgGrade() {
        return (avgMathGrade + avgEcoGrade + avgEngGrade) / 3;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Vlad", "Karsakov", 2, 5, 5, 5);
        Student st2 = new Student(2, "Vlad", "Karsakov", 3);
        Student st3 = new Student();
    }
}
