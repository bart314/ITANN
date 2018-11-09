import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;

public class Bibliotheek {
    private ArrayList<Boek> boeken = new ArrayList<>();
    
    private ArrayList<String> schrijvers = new ArrayList<>();
    private ArrayList<String> titels = new ArrayList<>();
    
    public Bibliotheek() {
        create();
        System.out.println(getPaginaByAuthorname2("Van Aken"));
    }
    
    public Boek getBoek(int idx) {
        if (idx<boeken.size()) {
            return boeken.get(idx);
        }
        else return null;
    }
    
    
    public void orderBooks() {
        Collections.sort(boeken, (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()) );
        printBoeken();
    }
    
    private void printBoeken() {
        boeken.forEach( System.out::println );
    }
    
    public long getPaginaByAuthorname2 (String name) {
        return boeken.stream()
          .filter ( boek -> boek.getAuthor().equals(name) )
          .map ( boek -> boek.getLengte() )
          .reduce (0, (acc, cnt) -> acc + cnt);
    }
    
    // public void demoTeller (List<Boek> foo) {
        // int tot = 0;
        // for(Boek b: foo) {
            // tot += b.getLengte();
        // }
        // return tot;
    // }
            
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    public long getPaginasByAuthor(String auteur) {
       return boeken.stream()
            .filter ( cur -> cur.getAuthor().contains(auteur) )
            .map ( p -> p.getLengte() )
            .reduce (0, (tot, cnt) -> tot+cnt );
    }
    
    
    
    
    
    public Boek getBoekOneLiner(int idx) {
        return (idx < schrijvers.size()) ?
            new Boek(titels.get(idx), schrijvers.get(idx)) :
            null;
    }
    
    public void create() {
    
        schrijvers.add("Van Aken");
        schrijvers.add("Van Tol");
        schrijvers.add("Coupland");
        schrijvers.add("Remarque");
        schrijvers.add("Goethe");
        schrijvers.add("Latour");
        schrijvers.add("Ten Bos");
        schrijvers.add("管谟业");
        schrijvers.add("Van Aken");
        
        titels.add("De afvallige");
        titels.add("Musch");
        titels.add("JPod");
        titels.add("Der Weg zurück");
        titels.add("Das Leiden des jungen Werthers");
        titels.add("Nous n'avons jamais ête moderne");
        titels.add("Dwalen in het antropoceen");
        titels.add("红高粱");
        titels.add("Het fluwelen labyrinth");
        
        int[] pages = {510,480,240,180,468,123,154,320,280};
       
        for (int i=0; i<schrijvers.size(); i++) {
            // anonniem object
            boeken.add(new Boek(titels.get(i), schrijvers.get(i), pages[i]));
        }
    }
}