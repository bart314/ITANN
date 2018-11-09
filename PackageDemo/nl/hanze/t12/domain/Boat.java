package nl.hanze.t12.domain;

/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat implements HasFueltank
{
    // the size of the tank
    private float tankCap;
    // the fuel level
    private float level;
    // the rate in which the fuel is used
    private float rate;

    /**
     * Constructor
     * @param tankCap The size of the tank in litres
     * @param rate The rate in which the fuel in burned (
     */
    public Boat(float tankCap, float rate)
    {
        // fill her up ;-)
        this.tankCap=tankCap;
        this.level=tankCap;
        this.rate=rate;
    }

    /**
     * Implementation of the abstract drive method in HasFueltank
     * @param distance The distance to drive
     */    
    public void drive(float distance) 
    {
        level-=distance*rate;
        System.out.println("Drove "+distance);
    }

    /**
     * Implementation of the abstract getFuelLevel method in HasFueltank
     * @return The fuel level
     */    
    public float getFuelLevel()
    {
        return level;
    }
    
    /**
     * Implementation of the abstract fillTank method in HasFuelTank
     */
    public void fillTank() 
    {
        level=tankCap;
    }
}
