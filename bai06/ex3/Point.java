package bai06.ex3;



public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void rotate(double angle){
        double radians = Math.toRadians(angle);
        double xNew = x * Math.cos(radians) - y * Math.sin(radians);
        double yNew = x * Math.sin(radians) + y * Math.cos(radians);
        this.x = xNew;
        this.y = yNew;
    }
    public void scale(double factor){
        this.x *= factor;
        this.y *= factor;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

}
