package Solo;

import java.util.Scanner;

public class Q5qMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int maximum;
        if(a > b){
            if(a > c){
                if(a > d){
                    maximum = a;
                }
                else{
                    maximum = d;
                }
            }
            else{
                if(c > d){
                    maximum = c;
                }
                else{
                    maximum = d;
                }
            }
        }
        else{
            if(b > c){
                if(b > d){
                    maximum = b;
                }
                else{
                    maximum = d;
                }
            }
            else{
                if(c > d){
                    maximum = c;
                }
                else{
                    maximum = d;
                }
            }
        }
        System.out.println("The maximum is (by if-else) " + maximum);

        int maxim = (a > b) ? (a > c ? (a > d ? a : d): (c > d ? c : d)) : (b > c ? (b > d ? b:d):(c > d ? c:d));

        System.out.println("The maximum is (Ternary Operator) is " + maxim);
    }
}
