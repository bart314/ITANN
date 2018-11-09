package nl.hanze.t12.domain;

import java.util.ArrayList;

/**
 * A garage repairs vehicles
 * 
 * @author zech 
 * @version 1.0
 */
public class Garage
{
    // the list of vehicles to be repaired
    private ArrayList<Vehicle> vehicles;
    // private Bicycle bike;
    
    /**
     * Constructor for objects of class Garage
     */
    public Garage()
    {
        // initialise list of vehicles
        vehicles=new ArrayList<Vehicle>();
    }
    
    /**
     * Method to enlist a vehicle to the queue of vehicles 
     * @param vehicle The vehicle to be repaired
     */
    public void enqueue(Vehicle vehicle)
    {
        // add vehicle to queue of vehicles
        vehicles.add(vehicle);
    }
    
    /**
     * Method that repairs the vehicles in the list. 
     * After calling, every vehicle is repaired.
     */
    public void stopDrinkingCoffeeAndRepairVehicles()
    {
        // as long there are more vehicles to repair
        while(vehicles.size()>0) 
        {
            // get vehicle first in line
            Vehicle vehicle=vehicles.get(0);
            // repair it
            vehicle.repair();
            // finished repairing, so remove from list
            vehicles.remove(0);
        }
    }
}
