public abstract class Persoon {
    protected String rol;
    private String naam, geboortedatum;
    
    public void setNaam(String v) { this.naam = v; }
    public String getNaam () { return this.naam; }
    
    public void setGeboortedatum(String v) { this.geboortedatum = v; }
    public String getGeboortedatum() { return this.geboortedatum; }
    
    public String getRol() { return this.rol; }
}