import MCA.*;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(65,"Pankaj Kumar");
        s.display();
        System.out.println("Total marks are:"+s.total_marks);
        System.out.println("Percentage is: "+(s.total_marks*100)/500);
    }
}
