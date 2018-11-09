import java.util.ArrayList;

public class Client {
    private ArrayList<Persoon> persons;

    public Client() {
        persons = new ArrayList<>();
        addElementen();
        toonGegevens();
    }

    private void toonGegevens() {
        for (Persoon p: persons) {
            System.out.println(p);
        }
    }

    private void addElementen() {
        Persoon bart = new Docent();
        bart.setNaam("Barnard");
        bart.setGeboortedatum("november 1970");
        bart.setGender('M');

        Docent fenna = new Docent();
        fenna.setNaam("Feenstra");
        fenna.setGender('V');
        fenna.setGeboortedatum("november 1970");
        fenna.setIndienst("september 2007");
        fenna.setInstituut("engineering");
        fenna.setSalaris(12);

        Persoon henk = new Student();
        henk.setNaam("Zijlstra");
        henk.setGeboortedatum("december 1999");
        henk.setGender('M');

        Student yfke = new Student();
        yfke.setNaam("Yfke");
        yfke.setGeboortedatum("augsutus 2000");
        yfke.setGender('V');
        yfke.setOpleiding("Informatica");
        yfke.setStudentnummer(300489);
        yfke.setStudiejaar(2017);

        persons.add(bart);
        persons.add(fenna);
        persons.add(henk);
        persons.add(yfke);
    }

}
