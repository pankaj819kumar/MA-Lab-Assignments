package Q4;

import java.util.Scanner;

public class q4 {
    static int setSquare(int l) {
        if (l < 0) {
            throw new ArithmeticException("Negative length of the tiles is impossible");
        } else {
            return l;
        }
    }

    static int setArea(int l) {
        int x = setSquare(l);
        return x * x;
    }

    static int setFloorArea(int y, int n) {
        int z = setArea(y);
        return n * z * z;
    }

    static int costTotal(int l, int n, int rs) {
        return rs * setFloorArea(l, n);
    }

    public static void main(String[] args) {
        System.out.println("THE PROGRAM IS ALL ABOUT COST REQUIRED TO PUT NUMBER OF TILES");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of each tile");
        int length = s.nextInt();
        System.out.println("Enter the number of tiles");
        int tileNumber = s.nextInt();
        System.out.println("Enter the cost of putting each tile:");
        int cost = s.nextInt();
        System.out.println("The cost required to put given number of tiles is ");
        System.out.println(costTotal(length, tileNumber, cost));
        s.close();
    }
}
