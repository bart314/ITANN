package nl.hanze.t12.domain;

/**
 * Car is subclass of Vehicle 
 * 
 * @author zech 
 * @version 1.0
 */
public class Car extends Vehicle implements HasFueltank, Comparable<Car>
{
    // in this context our cars always have four wheels
    private final static int NUM_OF_WHEELS=4;   
    // the size of the engine
    private float engineSize;
    // the size of the tank
    private float tankCap;
    // the fuel level (%)
    private float level;
    // the rate in which the fuel is used
    private float rate;
    
    private Bestuurder bestuurder;
    
    /**
     * Implementation of the compareTo method of Comparable<Car>
     * Behavior: larger engineSize means "bigger" car 
     * @param car The other car to compare with
     */
    public int compareTo(Car car) 
    {
        return (int)(engineSize-car.engineSize);
    }
    
    /**
     * Constructor
     */
    public Car(String brand, float weight, float engineSize, float tankCap, float rate)
    {
        // call the constructor of Vehicle
        super(brand, weight, NUM_OF_WHEELS);
        // Set the size of the engine
        setEngineSize(engineSize);
        // fill her up ;-)
        this.tankCap=tankCap;
        this.level=100.0f;
        this.rate=rate;
        this.bestuurder = new Bestuurder("Henk");
    }
    
    public String getBestuurdersNaam() {
        return bestuurder.getName();
    }

    /**
     * Setter for field engineSize
     * @param engineSize The size of the engine
     */
    public void setEngineSize(float engineSize)
    {
        this.engineSize=engineSize;
    }
    
    /**
     * Getter for field engineSize
     * @return The size of the engine
     */
    public float getEngineSize()
    {
        return engineSize;
    }
    
    /**
     * Overrides the repair method in Vehicle
     */
    public void repair() 
    {
        System.out.println("Repaired a car");
    }

    /**
     * Overrides the toString() method in Object
     * @return The string representation of a Car 
     */
    public String toString() 
    {
        return super.toString()+", EngineSize "+engineSize;
    }
    
    /**
     * Overridden equals method from Vehicle
     * @param The object to compare with
     * @return boolean indicating the equality of two objects
     */
    public boolean equals(Object o)
    {
        if (o==this) return true;
        if (!(o instanceof Car)) return false;
        // cast and check underlying fields
        Car c=(Car) o;
        return (super.equals(c) && engineSize==c.engineSize);
    }
    
    /**
     * Implementation of the abstract drive method in HasFueltank
     * @param distance The distance to drive
     */
    public void drive(float distance) 
    {
        level-=distance/rate;
        System.out.println("Drove "+distance);
    }
    
    /**
     * Implementation of the abstract getFuelLevel method in HasFueltank
     * @return The fuel level
     */
    public float getFuelLevel()
    {
        return (level/tankCap)*100;
    }
    
    /**
     * Implementation of the abstract fillTank method in HasFuelTank
     */
    public void fillTank() 
    {
        level=tankCap;
    }
}
