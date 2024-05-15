package bai09.ex04.shapes;

import bai09.ex04.TwoDimShape;

public class Rectangle extends TwoDimShape {
    private final double width;
    private final double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle: " + getName() + ", Width: " + width + ", Height: " + height + ", Area: " + area();
    }
}
