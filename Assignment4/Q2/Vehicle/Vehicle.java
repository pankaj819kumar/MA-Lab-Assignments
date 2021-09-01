package Vehicle;

public class Vehicle {
    protected int vehicle_id;
    protected String type;
    public Vehicle(int vehicle_id, String type){
        this.vehicle_id = vehicle_id;
        this.type = type;
    }
    public void display(){
        System.out.println("Vehicle ID is: "+vehicle_id);
        System.out.println("type is: "+type);
    }
}
