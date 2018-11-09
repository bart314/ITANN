public class Mens extends Zoogdier { 
    private int schoenmaat;

    public Mens () {
        super(2);
    }
    
    public Mens (int schoenmaat) {
        this();
        setSchoenmaat(schoenmaat);
    }
    
    @Override
    public String showInfo() {
        String rv = super.showInfo();
        rv += "schoenmaat: " + getSchoenmaat();
        
        return rv;
    }
    
    
    public void setSchoenmaat(int value) { this.schoenmaat = value; }
    public int getSchoenmaat() { return this.schoenmaat; }
}