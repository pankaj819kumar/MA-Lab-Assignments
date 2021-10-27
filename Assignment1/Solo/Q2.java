package Solo;

class Addition{
    int sum;
    public Addition(int a, int b){
        sum = a + b;
    }
    public Addition(int a, int b, int c){
        sum = a + b + c;
    }
    public Addition(int a, int b, int c, int d){
        sum = a + b + c + d;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Addition obj1 = new Addition(2,3);
        Addition obj2 = new Addition(2,3,4);
        Addition obj3 = new Addition(2,3,4,5);
        System.out.println(obj1.sum);
        System.out.println(obj2.sum);
        System.out.println(obj3.sum);
    }
}
