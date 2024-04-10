package bai05.ex03;

public class Student {
    private final String studentName;
    private final int year;
    private final int diemThi;

    public Student(String name, int year, int diemThi) {
        this.studentName = name;
        this.year = year;
        this.diemThi = diemThi;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getYear() {
        return year;
    }

    public int getDiemThi() {
        return diemThi;
    }
}