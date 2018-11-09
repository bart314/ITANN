package nl.hanze.t12.domain; 

/**
 * Vehicle is a basic class modeling a vehicle
 * 
 * @author zech
 * @version 1.0
 */
public abstract class Vehicle 
{
    // the brand of the vehicle
    private String brand;
    // the weight of the vehicle
    protected float weight;
    // the number of wheels attached to the vehicle
    protected int numberOfWheels;

    /**
     * Constructor for objects of class Vehicle
     * @param brand The brand of the vehicle
     * @param weight The weight to be set
     * @param numberOfWheels
     */
    public Vehicle(String brand, float weight, int numberOfWheels)
    {
        // set the brand
        setBrand(brand);
        // set the weight
        setWeight(weight);
        // set the number of wheels
        setNumberOfWheels(numberOfWheels);
    }

    /**
     * Setter for field brand
     * @param brand The brandname to be set
     */
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    
    /**
     * Setter for field weight
     * @param weight The weight to be set
     */
    public void setWeight(float weight)
    {
        this.weight=weight;
    }
    
    /**
     * Setter for field numberOfWheels
     * @param numberOfWheels The number of wheels to be set
     */
    public void setNumberOfWheels(int numberOfWheels) 
    {
        this.numberOfWheels=numberOfWheels;
    }
    
    /**
     * Getter for field brand
     * @return Brandname of this vehicle
     */
    protected String getBrand()
    {
        return brand;
    }
    
    /**
     * Getter for field weight
     * @return Weight of the vehicle
     */
    public float getWeight()
    {
        return weight;
    }
    
    /**
     * Getter for field numberOfWheels
     * @return The number of wheels
     */
    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }
    
    /**
     * An abstract method to repair the vehicle
     */ 
    public abstract void repair();

    /**
     * Overridden toString() method from Object
     * @return The string representation of a vehicle
     */
    public String toString()
    {
        return "Brand "+brand+", Weight "+weight+", NumberOfWheels "+numberOfWheels;
    }
    
    /**
     * Overridden equals method from Object
     * @param The object to compare with
     * @return boolean indicating the equality of two objects
     */
    public boolean equals(Object o)
    {
        if (o==this) return true;
        if (!(o instanceof Vehicle)) return false;
        // cast and check underlying fields
        Vehicle v=(Vehicle) o;
        return (brand.equals(v.brand) && weight==v.getWeight() && numberOfWheels==v.getNumberOfWheels());
    }
}
