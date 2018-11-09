import java.util.ArrayList;

public class Garage {
    private ArrayList<String> vehicles;
    
    public Garage() {
        vehicles = new ArrayList<String>();
    }
    
    public void addVehicle(String name) {
        vehicles.add(name);
    }
    
    public int getNumberOfVehicles() {
        return vehicles.size();
    }
    
    /*
     * Voorbeeld 1: deze methode doet helemaal niets met de
     * mogelijk fouten die kunnen optreden. Wanneer er een 
     * key wordt verwijderd die niet bestaat, wordt er gewoon
     * een fout gemeld en houdt het programma op met werken.
     */
    
    public void repair1(int key) {
        vehicles.remove(key);        
        System.out.println("Auto met nummer " +key+  " is gerepareerd.");
    }
    
    /*
     * Voorbeeld 2: deze methode geeft een FALSE terug wanneer de key
     * groter is dan het aantal auto's dat momenteel in de garage staat.
     * De verantwoordelijkheid voor het juist afhandelen van die FALSE
     * ligt dus bij de caller...
     */
    
    public boolean repair2(int key) {
        if (vehicles.size() > key) {
            vehicles.remove(key);        
            System.out.println("Auto met nummer " +key+  " is gerepareerd.");
            return true;            
        } else return false;
    }  
   
   /*
    * Voorbeeld 3: deze methode geeft een String terug en gooit
    * een exceptie wanneer de key niet in de ArrayList voorkomt.
    */
   
   public String repair3(int key) {
       if (vehicles.size() < key) {
           throw new IndexOutOfBoundsException("Zoveel auto's zijn er niet!");
           // not reached
        } else {
            vehicles.remove (key);
            return "Auto met nummer " +key+ " is gerepareerd";
        }
    }
}