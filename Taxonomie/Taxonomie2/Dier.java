class Dier {
    private String naam;
    
    public void setNaam(String v) { this.naam = v; }
    public String getNaam() { return this.naam; }
    
    void print() {
        System.out.println("Dit dier heet "+naam);
        System.out.println("");
    }
    
}