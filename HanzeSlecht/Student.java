public class Student {
    private String studentnummer;
    private String naam;
    private char geslacht;
    
    public Student (String naam) {
        this.naam = naam;
        this.geslacht = 'V';
        this.studentnummer = "3141592";
    }
    
    public Student (String naam, String nummer, char geslacht) {
        this.naam = naam;
        this.studentnummer = nummer;
        this.geslacht = geslacht;
    }
    
    public String getInfo() {
        String rv = "Student ";
        rv += naam + " heeft studentnummer " + studentnummer;
        rv += " en is een ";
        
        switch (geslacht) {
            case 'V': rv += "meisje."; break;
            case 'M': rv += "jongetje"; break;
        }
        
        return rv;
    }
}