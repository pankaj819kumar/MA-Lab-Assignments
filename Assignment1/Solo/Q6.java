package Solo;

public class Q6 {
    public static void main(String[] args) {
        int z=8;
        System.out.println(z);

        int a= z++ + ++z;
        System.out.println(a);

        int b= z-- + --z;
        System.out.println(b);

        int c= z++;
        System.out.println(c);

        int d=++z;
        System.out.println(d);

        int e=z--;
        System.out.println(e);

        int f=--z;
        System.out.println(f);
    }
}
// z=8,
// a= z++ + ++z,
// b= z-- + --z
// c= z++,
// d=++z,
// e=z--,
// f=--z
