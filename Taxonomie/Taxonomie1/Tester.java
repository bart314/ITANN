import java.util.ArrayList;

class Tester{
    private ArrayList<Dier> dieren = new ArrayList<>();

    public Tester() {
        createDieren();
        showDieren();
    }

    private void createDieren() {
        Kat k1 = new Kat();
        k1.setNaam("Roosje");
        Kat k2 = new Kat();
        k2.setNaam("Mr. Mofongo");
        Kat k3 = new Kat();
        k3.setNaam("Snoepje");
        Kat k4 = new Kat();
        k4.setNaam("Karel de Grote");
        Kat k5 = new Kat();
        k5.setNaam("Jongheer Walter de Roschbrun");

        Mens m1 = new Mens();
        m1.setNaam("Jan");
        Mens m2 = new Mens();
        m2.setNaam("Piet");
        Mens m3 = new Mens();
        m3.setNaam("Klaas");
        Mens m4 = new Mens();
        m4.setNaam("Françoice");
        Mens m5 = new Mens();
        m5.setNaam("Fenna");
        
        dieren.add(k1);
        dieren.add(k2);
        dieren.add(k3);
        dieren.add(k4);
        dieren.add(k5);
        dieren.add(m1);
        dieren.add(m2);
        dieren.add(m3);
        dieren.add(m4);
        dieren.add(m5);
    }
    
    private void showDieren() {
        for (Dier d: dieren) {
            d.print();
        }
    }
}

        
        
 