public class Vehicle {
    private String type;
    private float size;
    private int uitstoot;

    public Vehicle () {
        this("Aston Martin", 30f, 12);
    }
    
    public Vehicle (String type, float size, int uitstoot) {
        this.type = type;
        this.size = size;
        this.uitstoot = uitstoot;
    }
    
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false; 
        
        Vehicle other = (Vehicle)obj;
        return ( type.equals(other.type) 
                && size == other.size
                && uitstoot == other.uitstoot
               );
    }
}

        