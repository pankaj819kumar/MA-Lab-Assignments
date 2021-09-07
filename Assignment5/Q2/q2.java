package Q2;

import Q2.pkg.*;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating array list1 ans list2
        int list1[] = new int[5];
        int list2[] = new int[5];

        //taking input for arrays
        System.out.println("Enter 5 numbers to get sum: ");
        for(int i = 0; i < 5; i++){
            list1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 numbers to get minimum: ");
        for(int i = 0; i < 5; i++){
            list2[i] = sc.nextInt();
        }

        //creating object of sum class and min class
        sum s1 = new sum(); 
        min m1 = new min();

        try {
            int ans = s1.get_sum(list1)/m1.get_minimum(list2);
            System.out.println("The result is: "+ans);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program Completed");
    }
}
