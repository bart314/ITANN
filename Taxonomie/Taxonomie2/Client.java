import java.util.ArrayList;

class Client {
    private ArrayList<Dier> dieren = new ArrayList<>();
    
    Client() {
        createDieren();
        showDieren();
    }
    
    private void createDieren() {
        for (int i=0; i<5; i++) {
            dieren.add(new Kat());
        }
        
        for (int i=0; i<5; i++) {
            dieren.add(new Mens());
        }
        String[] namen = {"Rosa", "Mr. Mofongo", "Snoepje", "Tijger", "Jonkheer Walter de Roschbrun",
            "Henk", "Piet", "Klaas", "Janet", "Fenna", "Françoise"};
        int ctr = 0; 
        for(Dier d: dieren) {
            d.setNaam(namen[ctr++]);
        }
    }
    
    private void showDieren() {
        for (Dier d:dieren) {
            System.out.println(d.getNaam());
        }
    }
}