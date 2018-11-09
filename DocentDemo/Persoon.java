public abstract class Persoon {
    private String naam;
    private String geboortedatum;
    private char gender;

    public abstract void setDieetWensen(String wensen);
    
    @Override
    public String toString() {
        String aanspreek = gender=='M' ? "De heer" : "Mevrouw";
        return aanspreek +naam+ " (geboren op " +geboortedatum+ ")\n";
    }

	
    public String getNaam() { return naam; }

    public void setNaam(String naam) {	this.naam = naam; }

    public String getGeboortedatum() {	return geboortedatum; }

    public void setGeboortedatum(String geboortedatum) { this.geboortedatum = geboortedatum; }

    public char getGender() { return gender; }

    public void setGender(char gender) {this.gender = gender; }

}
