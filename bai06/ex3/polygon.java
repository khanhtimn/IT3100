package bai06.ex3;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

public class polygon {
    private List<Point> points;
    private Bundle bundle;

   public polygon(Bundle bundle){
       this.bundle = bundle;
       this.points = new ArrayList<>();
   }
    public void addPoint(Point point){
        points.add(point);
   }

    public void rotate(double angle){
        for (Point point : points) {
            points.rotate(angle);
        }
    }
    public void scale(double factor){
        for (Point point : points){
            points.scale(factor);
        }
    }

    public String toString(){
        return "Points: " + points + "," + "Bundle: " + bundle;
    }

}
