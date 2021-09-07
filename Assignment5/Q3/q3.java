package Q3;

import java.util.Scanner;

public class q3 {
    static void unchecked_exception() {
        // example 1
        int a = 9;
        int b = 0;
        System.out.println(a / b);

        // example 2
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(arr[8]);
    }

    static void unchecked_exception_handle() {
        int a = 9;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }

        int arr[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(arr[8]);
        } catch (Exception e) {
            System.out.println("Index out of bound");
        }
    }

    static void checked_exception() {
        // EXAMPLE 1
        String ptr = null;
        try {
            if (ptr.equals("parmeet")) {
                System.out.println("Same");
            } else {
                System.out.println("Not Same");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
        } finally {
            System.out.println("NullPointer Exception Checked");
        }

        // EXAMPLE2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any valid integer:");
        try {
            int x = Integer.parseInt(sc.next());
            System.out.println("Your number is " + x);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception Occured");
        } finally {
            System.out.println("NumberFormatException checked");
        }
        sc.close();

        // EXAMPLE3
        int[] arr = new int[] { 17, 66, 89, 30, 44, 56, 67 };
        System.out.println("Enter the given indice:");
        int n = sc.nextInt();
        try {
            int y = arr[n];
            System.out.println("The given number for the given index is " + y);
        } catch (Exception e) {
            System.out.println("The given number exceeds the indices");
        } finally {
            System.out.println("Out of Bounds Exception Checked");
        }
    }

    public static void main(String[] args) {
        unchecked_exception_handle();
        System.out.println("**************************");

        checked_exception();
        System.out.println("**************************");

        unchecked_exception();
    }
}
