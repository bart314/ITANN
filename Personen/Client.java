import java.util.*;

public class Client { 
    private ArrayList<Persoon> personen;
    
    public Client(){
        // Student st = new Student("Hans", true, "01-01-1995", "Economie", 4);
        // String s = st.toString();
        // System.out.println(st);
        
        // Persoon ps = new Persoon(" hans", true, "gebdat" );
       

        personen = new ArrayList<>();
        addStudenten();
        addDocenten();
        int i = 1;
        
        // for (Object ps : personen){
        // System.out.println(ps);
        // }
        
        // for (Object persoon : personen){
        // System.out.println(persoon);
        // }
        
        for (Persoon persoon : personen){
            Settings.showInfo("" + i + ".");
            persoon.showInfo();
            Settings.showInfo("");
            i++;
        }
    }

    public void addStudenten(){
        personen.add(new Student("Hans", true, "01-01-1995", "Economie", 4));
        personen.add(new Student("Lieke", false, "17-07-1999", "Economie", 2));
        personen.add(new Student("Berend", true, "21-12-1982", "Economie", 9));
        personen.add(new Student("Marlot", true, "03-11-2000", "Economie", 1));
        
    }
    
    public void addDocenten(){
        personen.add(new Docent("Jorrit", true, "12-02-1965", "01-09-2012", "Hanzehogeschool" ));
        personen.add(new Docent("Madeleine", false, "11-05-1979", "24-01-2003", "Hanzehogeschool" ));
        personen.add(new Docent("Sheila", false, "12-02-1972", "01-08-2010", "Hanzehogeschool" ));
        personen.add(new Docent("Kor", true, "12-02-1985", "01-08-2015", "NHL" ));
    }
}