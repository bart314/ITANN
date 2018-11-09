
public class Persoon {
    private String naam;
    private boolean man;
    private String geboorteDatum;
    
    public Persoon(String naam, boolean man, String geboorteDatum){
        this.naam = naam;
        this.man = man;
        this.geboorteDatum = geboorteDatum;
    }
    
    public void showInfo(){
        String temp = man ? "man " : "vrouw ";
        
        Settings.showInfo("Dit is een persoon. Je weet wel, een tweevoeter met een intelligent brein" +
        " en een lang voorhoofd. Deze persoon heet " + naam + " en is een " + temp + "geboren op " + geboorteDatum);
                      
    }
    
    
}
