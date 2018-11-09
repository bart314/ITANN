public class Tester2{
    public Tester2 () {
        Car c1 = new Car ("Opel", 1.2f, 12);
        Vehicle v1 = new Vehicle ("Opel", 1.2f,12);
        
        if (v1.equals(c1)) System.out.println("v1 en c1 zijn hetzelfde.");
        if (c1.equals(v1)) System.out.println("c1 en v1 zijn hetzelfde.");
    }
}
        
        
