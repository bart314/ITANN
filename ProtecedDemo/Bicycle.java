public class Bicycle extends Vehicle {
    private double tireSize;
    
    public Bicycle() {
        this.tireSize = 27*2.54;
    }
    
    public void setTireSize (double r) {
        this.tireSize = r;
    }
    
    public double getTireSize () {
        return this.tireSize;
    }
    
    protected double getSpeed (int rotation) {
        double rot = rotation/60;
        double speed = super.getSpeed(rot, tireSize);
        
        return speed;
    }
}
