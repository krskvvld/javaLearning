package dz11;

public class Student {
    private String name;
    private String surname;
    private int avgGrade;

    public Student(String name, String surname, int avgGrade) {
        this.name = name;
        this.surname = surname;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAvgGrade() {
        return avgGrade;
    }
}

class StudentTest {
    public static void fullComparison(Student s1, Student s2) {
        if (!(s1.getName().equals(s2.getName()) && s1.getSurname().equals(s2.getSurname()) && s1.getAvgGrade() == s2.getAvgGrade())) {
            System.out.println("Студенты не равны");
        } else {
            System.out.println("Студенты равны");
        }
    }

    public static void partialComparison(Student s1, Student s2) {
        if (s1.getName().equals(s2.getName())) {
            if (s1.getSurname().equals(s2.getSurname())) {
                if (s1.getAvgGrade() == s2.getAvgGrade()) {
                    System.out.println("Студенты полностью равны");
                } else {
                    System.out.println("У студентов одинаковые имя и фамилия, но разные средние оценки");
                }
            } else {
                System.out.println("У студентов одинаковые имена, но разные фамилии");
            }
        } else {
            System.out.println("У студентов разные имена");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vlad", "Karsakov", 5);
        Student s2 = new Student("neVlad", "Karsakov", 5);

        fullComparison(s1, s2);
        partialComparison(s1, s2);
    }
}
