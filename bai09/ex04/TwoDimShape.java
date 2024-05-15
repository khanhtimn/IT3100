package bai09.ex04;

public class TwoDimShape {
    private String name;

    public TwoDimShape(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Area: " + area();
    }
}

