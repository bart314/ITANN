public class Kat extends Zoogdier {
    private String vachtkleur;
    
    public Kat() {
        super(4);
    }
    
    public Kat(String vachtkleur) {
        this();
        setVachtKleur(vachtkleur);
    }
    
    @Override
    public String showInfo() {
        String rv = super.showInfo();
        rv += "De vachtkleur is " +getVachtKleur();
        return rv;
    }
    
    public String getVachtKleur() { return this.vachtkleur; }
    public void setVachtKleur(String value) { this.vachtkleur = value; }
}
