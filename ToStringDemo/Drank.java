public class Drank  {
    private String type;
    
    public Drank () {
    }
    
  
    public void drink (int amount) {
        Settings.show("Wat wil je drinken dan?");
    }
    
    @Override
    public String toString() {
        return super.toString() + "Het is lekker drankje";
    }
    
}

    