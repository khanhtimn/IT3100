package bai04.ex1;

public class Student {
    private final String studentName;
    private final int year;


    public Student(String name, int year) {
        this.studentName = name;
        this.year = year;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getYear() {
        return year;
    }

}