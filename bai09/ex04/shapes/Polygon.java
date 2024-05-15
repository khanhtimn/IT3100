package bai09.ex04.shapes;

import bai09.ex04.TwoDimShape;

public class Polygon extends TwoDimShape {
    public Polygon(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Polygon: " + getName();
    }
}
