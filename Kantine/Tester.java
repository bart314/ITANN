import java.util.ArrayList;
import java.util.Collections;

public class Tester {
    private ArrayList<Persoon> personen;
    
    public Tester () {
        voegPersonenToe();
        laatPersonenZien();
    }
    
    private void voegPersonenToe() {
        personen = new ArrayList<>();
        Persoon henk = new Externe();
        henk.setNaam("Henk de Boer");
        henk.setGeboortedatum("12 januari 1980");
        
        Persoon karel = new Student();
        karel.setNaam("Karel de Groot");
        karel.setGeboortedatum("12 januari 2000");        
        
        Persoon marieke = new Medewerker();
        marieke.setNaam("Marieke de Vries");
        marieke.setGeboortedatum("12 januari 1965");
        
        Persoon yfke = new Docent();
        yfke.setNaam("Yfke Smit");
        yfke.setGeboortedatum("4 augustus 1987");
        
        Collections.addAll(personen, henk, karel, marieke, yfke);
    }
    
    private void laatPersonenZien() {
        for (Persoon p : personen) {
            System.out.print("Persoon met naam " +p.getNaam());
            System.out.print(" is geboren op " +p.getGeboortedatum());
            System.out.println(" en is een " +p.getRol());
        }
    }
}
        
        
        
        
        
        
        
    