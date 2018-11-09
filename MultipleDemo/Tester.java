public class Tester {
    private Garage garage = new Garage();
    
    public Tester() {
        garage.addVehicle("Citroën");
        garage.addVehicle("Opel");
        garage.addVehicle("Aston Martin");
        garage.addVehicle("Porche 911");
        garage.addVehicle("Suzuki Alto");
        
        showNumberOfCars();
    }       
    
    public boolean showRepairExceptionDemo(int i) {
        try {
            String foo = garage.repair4(i);
            
            // not reached if an exception is thrown
            System.out.println(foo);
            showNumberOfCars();
            return true;
        } catch (CarNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Er is een fout opgetreden.");
        } finally {
            
        }
        
        
        
        //hoe kunnen we er voor zorgen dat het programma wel hier komt,
        //bijvoorbeeld om dingen op te ruimen?
        System.out.println("Deze regel");
        return false;
    }
    
    
    private void showNumberOfCars() {
        System.out.println("Er staan nu " +garage.getNumberOfVehicles()+ " auto's in de garage.");
    }
}