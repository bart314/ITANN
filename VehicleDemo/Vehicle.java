public class Vehicle { //extends Object
    private String brand;
    private float weight;
    private int numberOfWheels;

    public Vehicle() {
    }

    /**
     * Constructor for objects of class Vehicle
     * @param brand The brand of the vehicle
     * @param weight The weight to be set
     * @param numberOfWheels
     */
    public Vehicle(String brand, float weight, int numberOfWheels){
        setBrand(brand);
        setWeight(weight);
        setNumberOfWheels(numberOfWheels);

        System.out.println("Calling constructor of Vehicle");
    }
    
   
    public void repair() {
        System.out.println("Dit ding is behoorlijk kapot...");
        System.out.println("En even later... weer een werkend VEHICLE");
    }

   
    public void setBrand(String brand){ this.brand=brand; }   
    public String getBrand() { return brand; }
    
    public void setWeight(float weight){ this.weight=weight; }     
    public float getWeight() { return weight; }
    
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels=numberOfWheels; }
    public int getNumberOfWheels() { return numberOfWheels; }
}
