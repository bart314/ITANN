public class Thee extends Drank {
    private String type;
    
    public Thee (String type) {
        this.type=type;
        super.setType("thee");
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
