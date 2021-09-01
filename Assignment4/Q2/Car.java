import Vehicle.*;

public class Car extends Vehicle{
    String car_body_style;
    int price;
    public Car(int vehicle_id, String type, String car_body_style, int price){
        super(vehicle_id, type);
        this.car_body_style = car_body_style;
        this.price = price;
    }
    public void display(){
        System.out.println("Vehicle ID is: "+vehicle_id);
        System.out.println("type is: "+type);
        System.out.println("car body style is: "+car_body_style);
        System.out.println("price is: "+price);
    }
}
