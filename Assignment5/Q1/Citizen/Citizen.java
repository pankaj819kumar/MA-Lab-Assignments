package Q1.Citizen;

abstract public class Citizen {
    public String name;
    public int aadhar_number;
    public int phone_number;
    public int age;

    public Citizen(String name, int aadhar_number, int phone_number, int age) {
        this.name = name;
        this.aadhar_number = aadhar_number;
        this.phone_number = phone_number;
        this.age = age;
    }
    abstract public void verifyAge();
}
