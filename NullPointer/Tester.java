public class Tester {
    private Garage garage = new Garage();
    private final int voorbeeld = 3;
    
    public Tester() {
        garage.addVehicle("Citroën");
        garage.addVehicle("Opel");
        garage.addVehicle("Aston Martin");
        garage.addVehicle("Porche 911");
        garage.addVehicle("Suzuki Alto");
        
        showNumberOfCars();
    }    
    
    public void showRepairVoorbeeld(int i) {
        if (voorbeeld == 1){        
            garage.repair1(i);
        } else if (voorbeeld == 2) {
            garage.repair2(i);
        } else {
            garage.repair3(i);
        }
        
        showNumberOfCars();
    }
    
    
    public void showRepairExceptionDemo(int i) {
        try {
            garage.repair1(i);
            // not reached if an exception is thrown
//            System.out.println(foo);
            showNumberOfCars();
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Die kar bestaat niet!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Er is een fout opgetreden.");
            e.printStackTrace();
        } finally {
            System.out.println("Hier ruim je je zooi op");
        }
    }
    
    
    private void showNumberOfCars() {
        System.out.println("Er staan nu " +garage.getNumberOfVehicles()+ " auto's in de garage.");
    }
}