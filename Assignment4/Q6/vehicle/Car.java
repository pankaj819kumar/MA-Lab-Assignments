  
package vehicle;

abstract public class Car implements Vehicle {
    @Override
    public void honk() {
        System.out.println("Car says: HONK HONK");
    }
}