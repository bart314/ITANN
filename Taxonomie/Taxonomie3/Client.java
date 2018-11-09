import java.util.ArrayList;

public class Client {
    private ArrayList<Dier> dieren = new ArrayList<>();
    
    public Client() {
        addMensen();
        addKatten();
        addKippen();
        addReigers();
        
        showReigers();
    }
    
    private void showReigers() {
        Reiger foo;
        for (Dier d:dieren) {
            if (d instanceof Reiger) {
                System.out.println(d.showInfo());
                System.out.println("");
            }
        }

    }
    
    private void addMensen() {
        dieren.add(new Mens(42));
        dieren.add(new Mens(38));
        dieren.add(new Mens(40));
        dieren.add(new Mens(41));
    }
    
    private void addKatten() {
        dieren.add(new Kat("rood"));
        dieren.add(new Kat("schildpad"));
        dieren.add(new Kat("zwart"));
        dieren.add(new Kat("cypers"));
    }
    
    private void addKippen() {
        dieren.add(new Kip("legbatterij"));
        dieren.add(new Kip("factory farm"));
        dieren.add(new Kip("keuterboertje"));
        dieren.add(new Kip("vrije uitloop"));
    }
    
    private void addReigers() {
        dieren.add(new Reiger("Spoordok"));
        dieren.add(new Reiger("Hoendiep"));
        dieren.add(new Reiger("Zuiderzee"));
        dieren.add(new Reiger("Waddenzee"));
    }
    

    
}