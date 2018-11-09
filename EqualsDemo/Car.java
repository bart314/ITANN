public class Car extends Vehicle {
    private int wielen;
    
    public Car() {
        this.wielen=4;
    }
     
    public Car (String type, float size, int uitstoot) {
        super (type, size, uitstoot);
        this.wielen=4;
    }
    
    
    /*
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false; 
        
        Car other = (Car)obj;
        return wielen == other.wielen;
    }
    */
}
  