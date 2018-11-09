public abstract class Drank  {
    private String type;
    
    public Drank () {
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    // Dit is een lege methode, maar hij moet er wel zijn omdat anders 
    // de tester niet compileert...
    public abstract void drink (int amount);
}

    