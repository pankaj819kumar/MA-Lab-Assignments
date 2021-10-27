package Solo;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("This is a simple calculator.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Enter Operator: ");
        char op = sc.next().charAt(0);
        
        int b=0;
        if(op !='~'){
            System.out.println("Enter another number: ");
            b = sc.nextInt();
        }
        
        int ans=0;
        switch (op) {
            case '+':
                ans = a+b;
                break;
            case '-':
                ans = a-b;
                break;
            case '*':
                ans = a*b;
                break;
            case '/':
                ans = a/b;
                break;
            case '&':
                ans = a&b;
                break;
            case '|':
                ans= a|b;
                break;
            case '~':
                ans = ~a;
                break;
        }
        System.out.println("The answer is: " + ans);
    }
}
