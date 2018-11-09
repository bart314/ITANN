public class Tester {
    public Tester () {
        // Dit is vrij standaardwerk
        IDemo d1 = new DemoClass();
        System.out.println(d1.demoMethod());
        System.out.println(d1.multiplyDemo());
        
        // maar dit kan dus nu ook:
//        IDemo d2 = new DemoClass();
//        d2.demoMethod();

        IDemo bar = new Foo();
        Button fubar = new Foo();
        
        // maar dit niet, want een interface is altijd abstract.
//        IDemo bart = new IDemo();
    }
}