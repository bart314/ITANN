public class Docent {
    private String vierlettercode;
    private String naam;
    private char geslacht;
    
    public Docent (String naam) {
        this.naam = naam;
        this.geslacht = 'V';
        this.vierlettercode= "FEFE";
    }
    
    public Docent (String naam, String code, char geslacht) {
        this.naam = naam;
        this.vierlettercode = code;
        this.geslacht = geslacht;
    }
    
    public String getInfo() {
        String rv = "Docent ";
        rv += naam + " heeft vierlettercode " + vierlettercode;
        rv += " en is een ";
        
        switch (geslacht) {
            case 'V': rv += "meisje."; break;
            case 'M': rv += "jongetje"; break;
        }
        
        return rv;
    }
}