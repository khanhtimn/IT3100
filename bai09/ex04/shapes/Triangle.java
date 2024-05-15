package bai09.ex04.shapes;

import bai09.ex04.TwoDimShape;

public class Triangle extends TwoDimShape {
    private final double base;
    private final double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle: " + getName() + ", Base: " + base + ", Height: " + height + ", Area: " + area();
    }
}
