public abstract class Drank  {
    private String type;
    
    public Drank () {
    }
    
    public void setType (String v) { this.type = v; }
  
    public abstract String drink (int amount);
}

    