public class Bicycle extends Vehicle {
    private final static int NUM_OF_WHEELS=2;
    // brake by reverse pedal movement (false) or brake with your hands (true)
    private boolean brakeMethod;
    
    public Bicycle(String brand, float weight, boolean brakeMethod) {
        super(brand, weight, NUM_OF_WHEELS);        
        setBrakeMethod(brakeMethod);
        
        System.out.println("Calling constructor of Bicycle");
    }
    
    public void setBrakeMethod(boolean brakeMethod) { this.brakeMethod=brakeMethod; }
    public boolean getBrakeMethod() { return brakeMethod; }
}
