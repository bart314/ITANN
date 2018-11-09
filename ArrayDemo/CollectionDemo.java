import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

/*
 * Behalve ArrayList<> heb je in Java ook LinkedList<>. Op het eerste gezicht
 * lijken deze twee erg veel op elkaar, maar er zijn een paar subtiele 
 * verschillen:
 * 
+=======================|============================+ 
| ArrayList             |   LinkedList               |
+=======================+============================+ 
| Gebruikt intern een   |   Gebruikt intern aan      |
| dynamische array om   |   elkaar geknoopte         |
| de data op te slaan.  |   elementen om de data     |
|                       |   op te slaan.             |
+-----------------------+----------------------------+ 
| Sneller om data op    |   Sneller om data op       |
| te vragen (te lezen). |   te slaan (te schrijven). |
+-----------------------+----------------------------+ 
| Manipulatie van de    |   Manipulatie van de data  |
| data is langzamer.    |   is sneller.              |
+-----------------------+----------------------------+ 
| Dit is een lijst      |   Dit is een lijst en een  |
|                       |   rij.                     |
+-----------------------+----------------------------+ 
 * 
 */

class CollectionDemo {  
    
    public CollectionDemo () {
        System.out.println("Hier komt de ArrayList\n");
        arrayListDemo();
        
        System.out.println("Hier komt de LinkedList\n");
        linkedListDemo();
        
        System.out.println("Hier komt de HashSet\n");
        hashSetDemo();
    }
    
    void arrayListDemo() {
        ArrayList<String> foo = new ArrayList<>();
        foo.add("Henk");
        foo.add("Karel");
        foo.add("Jan");
        foo.add("Henk");
        printContents(foo);
    }        
    
    void linkedListDemo() {
        LinkedList<String> foo = new LinkedList<>();
        foo.add("Henk");
        foo.add("Karel");
        foo.add("Jan");
        foo.add("Henk");
        printContents(foo);
    }      
    
    /*
     * Behalve deze twee heb je ook nog een HashSet. Dit is een 
     * speciale verzameling, in de zin dat er geen dubbele waarden in
     * de verzameling kunnen zitten en dat er geen enkele garantie gegeven
     * wordt met betrekking tot de ordening van de elementen die erin zitten.
     */
    
    
    void hashSetDemo() {
        HashSet<String> foo = new HashSet<>();
        foo.add("Henk");
        foo.add("Karel");
        foo.add("Marieke");
        foo.add("Henk");
        printContents(foo);
    }      

    /*
     * De HashMap zijn we al een paar keer tegengekomen. Van belang is 
     * hierbij op te merken dat er geen dubbele keys in kunnen voorkomen
     * (natuurlijk wel dubbele values).
     * De HashMap is ook geen verzameling (Collection) in de strikte zin
     * van het woord (daarom kunnen we niet de methode hieronder gebruiken
     * om de inhoud ervan uit te printen).
     */
    
    void hashMapDemo(){
        HashMap<String, String> foo = new HashMap<>();
        foo.put("Henk","henk@dingen.org");
        foo.put("Karel","karel@dingen.org");
        foo.put("Jan","jan@dingen.org");
        foo.put("Henk","ander@dingen.org");

        System.out.println(foo.size());
        System.out.println(foo.get("Henk"));
        System.out.println(foo.get("henk"));
    }
    
    
    
    private void printContents(Collection<String> theList) {
        System.out.println( "De lengte van de lijst is "+theList.size() );
        theList.forEach(System.out::println);
    }
}
 