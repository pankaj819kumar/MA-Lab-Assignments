package Q1;

import Q1.Citizen.*;

class Vaccine extends Citizen{

    public Vaccine(String name, int aadhar_number, int phone_number, int age) {
        super(name, aadhar_number, phone_number, age);
    }

//    @Override
    public void verifyAge(){
        if(age <18) throw new ArithmeticException(name + " can not be vaccinated because age is less than 18");
        // if(age < 18){
        //     System.out.println(name+"'s Age is less than 18. Cannot be vaccinated.");
        // }
        else{
            System.out.println( name+" has been vaccinated");
            System.out.println(name+"'s Aadhar No and phone number is "+aadhar_number+" and "+phone_number);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Vaccine v1 = new Vaccine("Pankaj",1234,875858,20);
        v1.verifyAge();

        Vaccine v2 = new Vaccine("Ravi",4534,764677,16);
        v2.verifyAge();
    }
}
