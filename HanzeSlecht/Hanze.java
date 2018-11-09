import java.util.ArrayList;

public class Hanze {
    private ArrayList<Student> studenten = new ArrayList<Student>();
    private ArrayList<Docent> docenten= new ArrayList<Docent>();
    
    public Hanze () {
        voegStudentenToe();
        voegDocentenToe();
    }
    
    
    public void toonStudenten() {
        for (Student st: studenten) {
            System.out.println(st.getInfo());
        }
    } 
    
    public void toonDocenten() {
        for (Docent dc: docenten) {
            System.out.println(dc.getInfo());
        }
    }
        
    private void voegStudentenToe() {
        studenten.add(new Student("Henk", "212242343", 'M'));
        studenten.add(new Student("Françoise", "452463454", 'V'));
        studenten.add(new Student("Fenna", "92423545", 'V'));
        studenten.add(new Student("Jantje", "2342412545", 'M'));
        studenten.add(new Student("Tom", "546576", 'M'));
        studenten.add(new Student("Wilhelm", "235463", 'M'));
    }
    
    private void voegDocentenToe() {
        docenten.add(new Docent ("Bart", "BABA", 'M'));
        docenten.add(new Docent ("Chris", "ZECH", 'M'));
        docenten.add(new Docent ("Henk T", "HETJ", 'M'));
        docenten.add(new Docent ("Talko", "DITA", 'M'));
        docenten.add(new Docent ("Sharon", "BOLS", 'V'));
        docenten.add(new Docent ("Linda", "NOLI", 'V'));
    }
}