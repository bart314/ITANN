public class Drank  {
    private String type;
    
    public Drank () {
        
    }
    
    
    protected String getType() {
        return type;
    }
  
    public void drink (int amount) {
        Settings.show("Wat wil je drinken dan?");
    }
}

    