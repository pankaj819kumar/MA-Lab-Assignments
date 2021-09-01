package MCA;

import java.util.Scanner;

public class Student {
    int roll_no;
    String name;
    int marks[] = new int[5];

    public Student(int rln, String s) {
        roll_no = rln;
        name = s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public void display() {
        System.out.println("\nDetails are: \n" + "roll number: " + roll_no + "\nname: " + name + "\nAnd marks are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}