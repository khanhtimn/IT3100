package bai09.ex04.shapes;

import bai09.ex04.TwoDimShape;

public class Trapezoid extends TwoDimShape {
    private final double base1;
    private final double base2;
    private final double height;

    public Trapezoid(String name, double base1, double base2, double height) {
        super(name);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double area() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public String toString() {
        return "Trapezoid: " + getName() + ", Base 1: " + base1 + ", Base 2: " + base2 + " Height: " + height + ", Area: " + area();
    }
}
