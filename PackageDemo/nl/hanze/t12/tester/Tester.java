package nl.hanze.t12.tester;

import nl.hanze.t12.domain.*;
import nl.hanze.t12.domain2.TukTuk;


/**
 * Test class to show some inheritance concepts
 * 
 * @author zech
 * @version 1.0
 */
public class Tester 
{
    /**
     * Constructor for objects of class Tester
     */
    public Tester() {}

    
    public void showTukTuk() {
        TukTuk tuk = new TukTuk();
        
        System.out.println(tuk.subClassDemo());
    }
    
    
    /**
     * Test polymorphism with interfaces
     */
    public void testPolymorphismInterface(){
        HasFueltank c=new Car("Citroen", 1460.0f, 2201.0f, 75.0f, 12.0f);
        c.drive(100);
        System.out.println(c.getFuelLevel());
    }
    
    
     /**
     * Test overridden String method with protected access
     */
    public void testToStringMethod() {
        Car c=new Car("Citroen", 1460.0f, 2201.0f, 75.0f, 12.0f);
        System.out.println(c.toString());
        // protected access will work.
        //System.out.println(c.brand);
        //Dit werkt wel, want getBrand in Car is public.
        //System.out.println(c.getBrand());
    }
    
}