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
     * Voorbeeld 4: deze methode gooit een zelf gemaakte exceptie: CarNotFoundException.
     * Omdat we deze zelf hebben gemaakt, is het een checked exception; daarom moet er
     * in de signature worden opgenomen dat deze gegooid wordt (waarom moet dat denk je?).
     */
    public String repair4(int key) throws CarNotFoundException{
        if (vehicles.size() < key) {
           throw new CarNotFoundException("De auto met nummer " +key+ " is niet gevonden");
           // not reached
        } else {
            vehicles.remove (key);
            return "Auto met nummer " +key+ " is gerepareerd";
        }
    }
}