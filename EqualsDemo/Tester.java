public class Tester {
    public Tester() {
        Vehicle c1 = new Vehicle();                
        Vehicle c2=c1;
        if (c1.equals(c2)) System.out.println("c1 en c2 zijn hetzelfde.");  
        if (c1==c2) System.out.println("c1 en c2 zijn hetzelfde object!");
        
        // specifieke betekenis van hetzelfde...
        Vehicle b1 = new Vehicle();
        if (c1.equals(b1)) System.out.println("c1 en b1 zijn hetzelfde."); 
        
        // nog een wat explicieter voorbeeld...
        Vehicle b3 = new Vehicle ("Opel", 1.3f, 12);
        Vehicle b4 = new Vehicle ("Opel", 1.3f, 12);        
        if (b3.equals(b1)) System.out.println("b3 en b1 zijn hetzelfde."); 
        if (b3.equals(b4)) System.out.println("b3 en b4 zijn hetzelfde.");         
    }
}