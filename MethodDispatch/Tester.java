public class Tester {
    public Tester() {
        Tea d1 = new Tea("Earl Gray");
        Drank d2 = new Beer("Leffe");
        Drank d3 = new Drank();
        
        d1.drink(3);
        d2.drink(2);
        
        //Dit compileert maar geeft een run-time error. Waarom?
        Drank d4 = (Beer)d3;
        
        //Wat wordt er nu op het scherm getoond denk je?
        //(polymorphic method dispatching)
      Drank d5 = (Drank)d1;
      d5.drink(5);
    }
}