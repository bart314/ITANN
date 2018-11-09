public class Car extends Vehicle {
    // in this context our cars always have four wheels
    private final static int NUM_OF_WHEELS=4;   
    private float engineSize;
    
    public Car(String brand, float weight, float engineSize) {
        // not explicitly calling the constructor as the 
        // first statement is an error
        //setEngineSize(engineSize);
        
        super(brand, weight, NUM_OF_WHEELS);
        setEngineSize(engineSize);
        
        System.out.println("Calling constructor of Car");
    }

    public void setEngineSize(float engineSize) { this.engineSize=engineSize; }
    public float getEngineSize() { return engineSize; }
}
