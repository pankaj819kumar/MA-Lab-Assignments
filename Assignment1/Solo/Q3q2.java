package Solo;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class CircleArea{
    int radius;

    public CircleArea(int rad){
        radius = rad;
    }
    public double area(){
        return (3.14)*radius*radius;
    }
}

public class Q3q2 {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        CircleArea obj1 = new CircleArea(3);
        System.out.println("The area of the circle is " + df2.format(obj1.area()));
    }
}
