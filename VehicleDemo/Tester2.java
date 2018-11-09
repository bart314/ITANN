public class Tester2 {
    /**
     * Testmethod to show the availability of own methods and inherited methods 
     */
    public void testMethodCallSearch() {
        Car c=new Car("Citroen", 1460.0f, 2201.0f);
        // obviously can call method defined in Car
        System.out.println(c.getEngineSize());
        // but also possible to call method inherited from Vehicle
        System.out.println(c.getWeight());
        // and... finally... possible to call method inherited from Object
        System.out.println(c.toString());
        // well.. this is the same as
        System.out.println(c);
        // since the compiler adds the method toString() to an object when used in
        // print or println, as a convenience 
    }
    
    public void TestCasting() {
        Vehicle v=new Vehicle("SomethingWithWheels", 100.0f, 3);
        Car c1;
        //c1=v;
       
        Vehicle c5 = new Car("Citroen", 1460.0f, 2201.0f);
        Car c2 = (Car) c5;
        
        c1 = (Car) v;
        System.out.println(c1.getEngineSize());
    }
    
    public void testPolymorphicBehaviourOfClasses() {
        Vehicle v = new Vehicle("SomethingWithWheels", 100.0f, 24);
        Vehicle c5 = new Bicycle("Citroen", 1460.0f, false);
        System.out.println(c5.getBrand());
        Car test = (Car)c5;
//      test.getBrakeMethod();
        
       // if (c5 instanceof Bicycle) Bicycle test = (Bicycle)c5;
//      System.out.println(test.getEngineSize());
    
        //Car b1 = new Bicycle("Batavus", 45.0f, true);
        
        // a vehicle is not a car, so it will not compile
        //Car c = new Vehicle("SomethingWithWheels", 100.0f, 3);
        
        // Waarom werkt dit? Wat is het statische en wat het dynamische datatype
        //van c5?
        c5.repair();
        
        // and finally will this work?
        //Object o=new Bicycle("Batavus", 45.0f, true);
    }
    

    
    
    public void testPolymorphicBehaviourOfClassesUitwerkingen() {
        // well nothing special
        Vehicle v=new Vehicle("SomethingWithWheels", 100.0f, 24);
        Bicycle test;
        
        // a car is a vehicle (always read from right to left)
        Vehicle c5 = new Bicycle("Citroen", 1460.0f, false);
        System.out.println(c5.getBrand());
        //Car test = (Car)c5;
//        test.getBrakeMethod();
        
        // this will not work, since getEngineSize is a method of Car
       if (c5 instanceof Bicycle) test = (Bicycle)c5;
       
//        System.out.println(test.getEngineSize());
    
        // a bicycle is not a car, so it will not compile
        //Car b1=new Bicycle("Batavus", 45.0f, true);
        
        // a vehicle is not a car, so it will not compile
        //Car c=new Vehicle("SomethingWithWheels", 100.0f, 3);
        
        // back to the c5
        // only methods of Vehicle can be called, since we
        // told the compiler the type is a vehicle
        
        
        // but although the static type of c5 is Vehicle, its dynamic type is Car
        // so the repair method implementation of Car is called:
        c5.repair();
        
        // and finally will this work?
        //Object o=new Bicycle("Batavus", 45.0f, true);
    }
    
  
    
    /**
     * Testmethod to show explicit casting
     */
    public void testCastingUitwerkingen() {
        Vehicle v = new Vehicle("SomethingWithWheels", 100.0f, 3);
        Car c1;
        // will not compile, since a vehicle is not a car (in general)
        //c1=v;
        
        // a car is a vehicle, example of implicit casting
        Vehicle c5 = new Car("Citroen", 1460.0f, 2201.0f);
        // well you might assume in this case c5 is a car: use casting and it works!
        Car c2 = (Car) c5;
        
        // the attempted casting from v to c1 will succeed compile time, but we 
        // run into trouble runtime since c1 really references a vehicle object.
        // If the cast would succeed runtime it would be possible to call the method 
        // getEngineSize runtime which cannot be called on a Vehicle object. 
        // Java recognizes this situation and therefore ALWAYS forbids this cast runtime. 
        // (which also implies that existing methods in Vehicle cannot be called!)
        c1 = (Car) v;
        System.out.println(c1.getEngineSize());
    }
}
