public abstract class Student extends Persoon {
    private int studentnummer;
    private int studiejaar;;
    private String opleiding;

    @Override
    public String toString() {
        String rv = super.toString();
        rv += "(Studentnummer: " +studentnummer;
        rv += ") Studeert aan het instituut " +opleiding+ " sinds " +studiejaar +"\n";

        return rv;
    }

    public int getStudentnummer() { return studentnummer; }

    public void setStudentnummer(int studentnummer) { this.studentnummer = studentnummer; }

    public int getStudiejaar() { return studiejaar; }

    public void setStudiejaar(int studiejaar) { this.studiejaar = studiejaar; }

    public String getOpleiding() { return opleiding; }

    public void setOpleiding(String opleiding) { this.opleiding = opleiding; }
}
