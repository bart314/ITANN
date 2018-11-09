abstract class Drank  {
    private String type;
    
    public Drank () {
    }
    
    protected String getType() {
        return type;
    }
    
    public String callExes(int foo) {
        return "";
    }
    
    // Dit is een lege methode, maar hij moet er wel zijn omdat anders 
    // de tester niet compileert...
    public abstract void drink (int amount);
}

    