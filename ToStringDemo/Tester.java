public class Tester {
    public Tester() {
        Foo f = new Foo();
        System.out.println(f);
    }
    
    public void demo() {
        Drank d1 = new Tea("Earl Gray");
        Drank d2 = new Beer("Leffe");

        //Settings.show(d2);

        //Werkt het onderstaande ook?        
        System.out.println(d2);
        //       Settings.show(d2.toString());

        //  en wat wordt er hieronder afgedrukt, denk je?
               //Settings.show(d1);
    }
    
    
}