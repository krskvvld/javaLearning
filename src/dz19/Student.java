package dz19;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

//    public Student(StringBuilder name, int course, double grade) {
//        if (name.length() >= 3) {
//            this.name = name;
//        }
//        if (course > 0 && course <= 4) {
//            this.course = course;
//        }
//        if (grade > 0 && grade <= 10) {
//            this.grade = grade;
//        }
//    }

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4) {
            this.course = course;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName(new StringBuilder("Vlad"));
        s1.setCourse(2);
        s1.setGrade(4);
        s1.showInfo();
        System.out.println();
        Student s2 = new Student();
        s2.setName(new StringBuilder("Vlad"));
        s2.setCourse(1);
        s2.setGrade(5);
        s2.showInfo();
    }
}
