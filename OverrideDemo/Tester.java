import java.util.*;

public class Tester {
    private ArrayList<Drank> dranken = new ArrayList<Drank>();
    
    public Tester() {
        getMeSomeBeers();
        getMeSomeTea();
    }
    
    public void drinken() {
        Random rnd = new Random();
        Iterator<Drank> itr = dranken.iterator();
        while (itr.hasNext()) {
            Drank drank = itr.next();
            drank.drink(rnd.nextInt(7));
        }
    }
    
    
    private void getMeSomeBeers() {
        dranken.add(new Bier("Jupiler"));
        dranken.add(new Bier("Leffe"));
        dranken.add(new Bier("Duvel"));
        dranken.add(new Bier("Jopen"));
        dranken.add(new Bier("Korenwolf"));
    }
    
    private void getMeSomeTea() {
        dranken.add(new Thee("Earl gray"));
        dranken.add(new Thee("Lapsang Soesjong"));
        dranken.add(new Thee("Huang da Cha"));
        dranken.add(new Thee("茶"));
        dranken.add(new Thee("中国茶"));
        dranken.add(new Thee("很好喝的荼"));
    }
}

        