public class Tea extends Drank {
    private String type;
    
    public Tea (String type) {
        this.type=type;
    }
    
    public String getType() { return type; }    
    public void setType(String value) { this.type = value; }
    
    @Override
    public void drink(int amount) {
        Settings.show(amount+ " koppen " +type+"-thee gedronken.");
    }
}
