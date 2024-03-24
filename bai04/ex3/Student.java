package bai04.ex3;

public class Student {
    private final String studentName;
    private final int year;
    private int diemThi;


    public Student(String name, int year) {
        this.studentName = name;
        this.year = year;
        this.diemThi = 0;
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
    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }
}