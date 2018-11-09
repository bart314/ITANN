public class Docent extends Persoon {
    private String instituut;
    private String indienst;
    private int salaris;

    @Override
    public void setDieetWensen(String foo) {
    }
    
    @Override 
    public String toString() {
        String rv = super.toString();
        rv += "Werkzaam bij " +instituut+ " sinds " +indienst;
        rv += " in ingeschaald in schaal " +salaris +"\n";

        return rv;
    }

    public String getInstituut() { return instituut; }

    public void setInstituut(String instituut) { this.instituut = instituut; }

    public String getIndienst() { return indienst; }

    public void setIndienst(String indienst) { this.indienst = indienst; }

    public int getSalaris() { return salaris; }

    public void setSalaris(int salaris) { this.salaris = salaris; }

}
