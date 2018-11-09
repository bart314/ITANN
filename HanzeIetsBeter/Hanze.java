import java.util.ArrayList;

public class Hanze {
    private ArrayList<Person> personen= new ArrayList<Person>();
    
    public Hanze () {
        voegStudentenToe();
        voegDocentenToe();
        voegOBPToe();
    }
    
    /* welke refactorslag zien we nog bij de twee onderstaande methoden? */
    public void toonStudenten() {
        for (Person p: personen) {
            if (p.getType().equals("student"))
                System.out.println(p.getInfo());
        }
    } 
    
    public void toonDocenten() {
        for (Person p: personen) {
            if (p.getType().equals("docent"))
                System.out.println(p.getInfo());
        }
    }
    
        
    private void voegStudentenToe() {
        personen.add(new Student("Henk", "212242343", 'M'));
        personen.add(new Student("Françoise", "452463454", 'V'));
        personen.add(new Student("Fenna", "92423545", 'V'));
        personen.add(new Student("Jantje", "2342412545", 'M'));
        personen.add(new Student("Tom", "546576", 'M'));
        personen.add(new Student("Wilhelm", "235463", 'M'));
    }
    
    private void voegDocentenToe() {
        personen.add(new Docent ("Bart", "BABA", 'M'));
        personen.add(new Docent ("Chris", "ZECH", 'M'));
        personen.add(new Docent ("Henk T", "HETJ", 'M'));
        personen.add(new Docent ("Talko", "DITA", 'M'));
        personen.add(new Docent ("Sharon", "BOLS", 'V'));
        personen.add(new Docent ("Linda", "NOLI", 'V'));
    }
    
    
    private void voegOBPToe() {        
        personen.add(new OBP("Mosterd", "MOST", 'M'));
        personen.add(new OBP("Mischa", "TOMI", 'M'));
        personen.add(new OBP("Ada", "NAAD", 'V'));
        personen.add(new OBP("Nienke", "NITU", 'V'));
        personen.add(new OBP("Coen", "CEUL", 'M'));
        personen.add(new OBP("Theo", "BVKT", 'M'));
    }
    
}