package bai06.ex3;

import java.awt.*;

public class Bundle {
    private Color color;

    public Bundle(Color color){
        this.color = color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }
    public String toString(){
        return "Color: " + color;
    }
}
