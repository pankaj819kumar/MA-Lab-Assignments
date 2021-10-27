package Solo;
import java.util.Scanner;

public class Q5qMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min;
        if(a < b) {
            if(a < c) {
                if(a < d) {
                    min = a;
                }
                else{
                    min = d;
                }
            }
            else{
                if(c < d) {
                    min = c;
                }
                else{
                    min = d;
                }
            }
        }
        else {
            if(b < c) {
                if(b < d) {
                    min = b;
                }
                else{
                    min = d;
                }
            }
            else{
                if(c < d) {
                    min = c;
                }
                else{
                    min = d;
                }
            }
        }
        System.out.println("Minimum is (using if-else)" + min);

        int minimum =  a < b ? (a < c ? (a < d ?  a: d): (c < d ?  c:  d)) : (b < c ? (b < d?  b:  d): (c < d?  c:  d));
        System.out.println("Minimum is (using ternary)" + min);

    }
}
