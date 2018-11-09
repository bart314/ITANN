import java.util.ArrayList;
public class Garage {
    // the list of vehicles to be repaired
    private ArrayList<Vehicle> vehicles;
    //private Bicycle serviceBike;
    public Garage() {
        vehicles=new ArrayList<Vehicle>();
    }
    
    public void enqueue(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    
    public void stopDrinkingCoffeeAndRepairVehicles() {
        Vehicle vehicle;
        while(vehicles.size()>0) 
        {
            vehicle = vehicles.remove(0);
            vehicle.repair();
        }
    }
}
