package nl.hanze.t12.domain;

/**
 * Bicycle is subclass of Vehicle 
 * 
 * @author zech 
 * @version 1.0
 */
public class Bicycle extends Vehicle
{
    // in this context our bicylces always have two wheels
    private final static int NUM_OF_WHEELS=2;
    // brake by reverse pedal movement (false) or brake with your hands (true)
    private boolean brakeMethod;
    
    public Bicycle(String brand, float weight, boolean brakeMethod)
    {
        // call the constructor of Vehicle
        super(brand, weight, NUM_OF_WHEELS);
        // Set the type of break
        setBrakeMethod(brakeMethod);
    }

    /**
     * Setter for field brakeMethod
     * @param brakeMethod Method of braking
     */
    public void setBrakeMethod(boolean brakeMethod)
    {
        this.brakeMethod=brakeMethod;
    }
    
    /**
     * Getter for field brakeMethod
     * @return The method of braking
     */
    public boolean getBrakeMethod()
    {
        return brakeMethod;
    }
    
    /**
     * Implements the repair method in Vehicle
     */
    public void repair() 
    {
        System.out.println("Repaired a bicycle");
    }
    
    /**
     * Overrides the toString() method in Object
     * @return The string representation of a Car 
     */
    public String toString() 
    {
        return super.toString()+", BrakeMethod "+brakeMethod;
    }
    
    /**
     * Overridden equals method from Vehicle
     * @param The object to compare with
     * @return boolean indicating the equality of two objects
     */
    public boolean equals(Object o)
    {
        if (o==this) return true;
        if (!(o instanceof Bicycle)) return false;
        // cast and check underlying fields
        Bicycle b=(Bicycle) o;
        return (super.equals(b) && brakeMethod==b.getBrakeMethod());
    }
}
