package bai04.ex1;

public class Student {
    private String studentName;
    private int year;


    public Student(String name, int year) {
        this.studentName = name;
        this.year = year;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}