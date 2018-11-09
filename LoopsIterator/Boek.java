public class Boek {
    private String titel;
    private String schrijver;
    private int lengte;
    
    public Boek(String titel, String schrijver) {
        this.titel = titel;
        this.schrijver = schrijver;        
    }
    
    public Boek(String titel, String schrijver, int lengte) {
        this(titel, schrijver);
        this.lengte = lengte;
    }
    
    public String getAuthor() {
        return this.schrijver;
    }
    
    public int getLengte() {
        return lengte;
    }
    
    @Override
    public String toString() {
        return schrijver + " : " + titel;
    }
}