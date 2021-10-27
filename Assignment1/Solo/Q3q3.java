package Solo;

class RectangleArea{
    int length;
    int breadth;
    public RectangleArea(int len, int bred){
        length = len;
        breadth = bred;
    }
    public int area() {
        return length*breadth;
    }
}

public class Q3q3 {
    public static void main(String[] args) {
        RectangleArea obj1 = new RectangleArea(12,5);
        System.out.println("Area of the rectangle is " + obj1.area());
    }
}
