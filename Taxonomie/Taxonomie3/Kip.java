public class Kip extends Vogel {
    private String boerderijType;
    
    public Kip() {
        super(false);
    }
    
    public Kip(String type) {
        this();
        setBoerderijType(boerderijType);
    }
    
    @Override
    public String showInfo() {
        String rv = super.showInfo();
        rv += "De kip is opgegroeid in een " +getBoerderijType();
        return rv;
    }
    
    public void setBoerderijType (String value) { this.boerderijType = value; }
    public String getBoerderijType () { return this.boerderijType; }
}
        