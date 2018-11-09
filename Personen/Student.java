
public class Student extends Persoon {
    
    private String opleidingsRichting;
    private int studiejaar;
    
    public Student(String naam, boolean man, String geboorteDatum, String opleidingsRichting, int studiejaar){
        super(naam, man, geboorteDatum);
        this.opleidingsRichting = opleidingsRichting;
        this.studiejaar = studiejaar;
    
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        Settings.showInfo("Deze student volgt de opleiding " + opleidingsRichting + 
        " en zit in studiejaar " + studiejaar);
    }
    
    
    
}