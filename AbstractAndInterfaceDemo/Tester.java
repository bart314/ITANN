import java.util.*;

public class Tester {
    private ArrayList<Drank> dranken = new ArrayList<Drank>();
    
    public Tester() {  
        getMeSomeBeers();
        getMeSomeTea();
    }
    
    /**
     * we kunnen deze methode gebruiken omdat we weten dat er in dranken alleen objecten
     * van het type Drank zitten; en Drank heeft een methode drink(). Maar die wordt in alle
     * subklassen overschreven. Dus wat kunnen we met die methode doen..?
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
        dranken.add(new Beer("Jupiler"));
        dranken.add(new Beer("Leffe"));
        dranken.add(new Beer("Duvel"));
        dranken.add(new Beer("Jopen"));
        dranken.add(new Beer("Korenwolf"));
    }
    
    private void getMeSomeTea() {
        dranken.add(new Tea("Earl gray"));
        dranken.add(new Tea("Lapsang Soesjong"));
        dranken.add(new Tea("Huang da Cha"));
        dranken.add(new Tea("茶"));
        dranken.add(new Tea("中国茶"));
    }
}

        