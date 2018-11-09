public class Person {
    private String naam;
    private String code;
    private char geslacht;
    private String type;
    
    public Person (String naam, String code, char geslacht) {
        this.naam = naam;
        this.code = code;
        this.geslacht = geslacht;
    }
    
    public void setType (String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
   
    
    public String getInfo () {
        String rv = type +" " + naam + " heeft code " + code;
        rv += " en is een ";
        
        switch (geslacht) {
            case 'V': rv += "meisje."; break;
            case 'M': rv += "jongetje"; break;
        }
        
        return rv;
    }
}
        
    