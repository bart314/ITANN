package nl.hanze.t12.domain2;

import nl.hanze.t12.domain.*;

public class TukTuk extends Vehicle 
{
    private Bestuurder bestuurder;
    /**
     * Constructor for objects of class TukTuk
     */

    public TukTuk() {
        super("tuktuk", 240, 3);
        this.bestuurder = new Bestuurder("Karel");
    }
    
    public String subClassDemo() {
        return getBrand();
    }
    
    /** Deze methode werkt niet, omdat getName in Bestuurder
     * geen niet public of protected is. Er staat daar geen
     * visibility-modifier bij de signature, wat betekent dat
     * de methode alleen zichtbaar is binnen de package.
     */
    /*
    public String getBestuurderNaam() {
        return bestuurder.getName();
    }
    */

    public void repair() {
    }
}
