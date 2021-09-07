package Q5;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        // NOW DIVIDING ADDITION BY SUBTRACTION
        try {
            int x = addition / subtraction;
            System.out.println("The given result is " + x);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not possible");
        } finally {
            try {
                int y = addition % subtraction;
                System.out.println("The remainder using division of addition and subtraction is " + y);
            } catch (ArithmeticException e) {
                System.out.println("Remainder by zero not possible");
            } finally {
                System.out.println("ALL DONE");
            }
        }
        s.close();
    }
}