public class Tester {
    public Tester() {
    }

    public void testConstructorChain() {
        Vehicle v=new Vehicle("SomethingWithWheels", 100.0f, 3);
        Car c=new Car("Citroen", 1460.0f, 2201.0f);
        Bicycle b=new Bicycle("Batavus", 45.0f, true);
    }
    
    /**
     * Testmethod to show the polymorphic behaviour of the 
     * arraylist in Garage
     */
    public void testPolymorphismInArrayList() {
        Garage garage=new Garage();
        
        Vehicle v=new Vehicle("SomethingWithWheels", 100.0f, 3);
        Vehicle c5=new Car("Citroen", 1460.0f, 2201.0f);
        Bicycle b1=new Bicycle("Batavus", 45.0f, true);
        
        // enqueue the vehicles
        garage.enqueue(v);
        garage.enqueue(c5);
        garage.enqueue(b1);
        
        // now earn your money
        garage.stopDrinkingCoffeeAndRepairVehicles();
    }
    
    /**
     * Testmethod to show polymorphic behavior of classes
     */
    public void testPolymorphicBehaviourOfClasses() {
        // will this compile?
        Vehicle v=new Vehicle("SomethingWithWheels", 100.0f, 3);
        
        // will this compile?
        Vehicle c5=new Car("Citroen", 1460.0f, 2201.0f);
        
        // will this compile?
      //Car b1=new Bicycle("Batavus", 45.0f, true);
        
        // will this compile?
        Object c=new Vehicle("SomethingWithWheels", 100.0f, 3);
    }

 
    public void testCasting() {
        Vehicle v=new Vehicle("SomethingWithWheels", 100.0f, 3);
        Car c1;
        // will compile, but throws ClassCastException since a vehicle is not a car (in general)
        c1=(Car)v;
        
        // a car is a vehicle, example of implicit casting
        Vehicle c5=new Car("Citroen", 1460.0f, 2201.0f);
        // well you might assume in this case c5 is a car: use casting and it works (compile and runtime)!
        Car c2=(Car) c5;
    }
    
}
