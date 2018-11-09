public class Car extends Vehicle {
    private double tireSize;
    
    public Car() {
        this.tireSize = 18*2.54;
    }
    
    public void setTireSize (double r) { this.tireSize = r; }
    
    public double getRotation () { return this.tireSize; }
    
    public double getSpeed (int rotation) {
        double rot = rotation/60;
        double speed = super.getSpeed(rot, tireSize);
        return speed;
    }
    
    
}
