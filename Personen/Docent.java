
public class Docent extends Persoon {
    private String datumInDienst;
    private String werkgever;
    
    
    public Docent(String naam, boolean man, String geboorteDatum, String datumInDienst, String werkgever){
        super(naam, man, geboorteDatum);
        this.datumInDienst = datumInDienst;
        this.werkgever = werkgever;
    
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        Settings.showInfo("Deze docent werkt bij " + werkgever + " sinds "  + datumInDienst);
    }
    
}