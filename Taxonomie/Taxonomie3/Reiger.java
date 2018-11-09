public class Reiger extends Vogel {
    private String nestPlaats;
    
    public Reiger () {
        super(true);
    }
    
    public Reiger(String plaats) {
        this();
        setNestPlaats(plaats);
    }
    
    @Override 
    public String showInfo() {
        String rv = super.showInfo();
        rv += "Het wiegje van deze reiger stond in " 
            +getNestPlaats();
        return rv;
    }
    
    public void setNestPlaats(String value) { this.nestPlaats = value; }
    public String getNestPlaats() { return this.nestPlaats; }
}