import java.util.*;

public class Tester2 {
    private ArrayList<Drank> dranken = new ArrayList<Drank>();
    
    public Tester2() {  
        getMeSomeBeers();
        getMeSomeTea();
    }
    
    /**
     * we kunnen deze methode gebruiken omdat we weten dat er in dranken alleen objecten
     * van het type Drank zitten; en Drank heeft een methode drink(). Maar die wordt in alle
     * subklassen overschreven. Dus wat kunnen we met die methode doen..?
     * 
     * Vergelijk de methode hieronder eens met de HanzeIetsBeter uit week 4. Daar konden we
     * wel over een vergelijkbare ArrayList heen itereren, maar moesten we dingen toetsen 
     * met instanceof. 
     */
    public void drinken() {
        Random rnd = new Random();
        Iterator<Drank> itr = dranken.iterator();
        while (itr.hasNext()) {
            Drank drank = itr.next();
            drank.drink(rnd.nextInt(7));
        }
    }
    
    
    private void getMeSomeBeers() {
        dranken.add(new Jupiler("Jupiler"));
        dranken.add(new Jupiler("Leffe"));
        dranken.add(new Jupiler("Duvel"));
        dranken.add(new Jupiler("Jopen"));
        dranken.add(new Jupiler("Korenwolf"));
    }
    
    private void getMeSomeTea() {
        dranken.add(new Tea("Earl gray"));
        dranken.add(new Tea("Lapsang Soesjong"));
        dranken.add(new Tea("Huang da Cha"));
        dranken.add(new Tea("茶"));
        dranken.add(new Tea("中国茶"));
    }
}

        