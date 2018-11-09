public class Tester2 {
    public Tester2 () {
        Drank d1 = new Tea("Earl Gray");
        VerdovendMiddel d2 = new Beer("Jupiler");
        
        //polymorphic method dispatching
        d1.drink(2);
        
        //Maar dit werkt niet:
        //Drank d3 = new Drank();
    }
}
