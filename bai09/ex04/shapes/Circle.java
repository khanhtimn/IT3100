package bai09.ex04.shapes;

import bai09.ex04.TwoDimShape;

public class Circle extends TwoDimShape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + getName() + ", Radius: " + radius + ", Area: " + area();
    }
}
