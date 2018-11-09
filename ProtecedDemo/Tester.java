public class Tester {
    public Tester() {
        Car c1 = new Car();
        Bicycle b1 = new Bicycle();
        
        System.out.println("De fiets gaat " +b1.getSpeed(87)+ " m/s");
        System.out.println("De auto gaat " +c1.getSpeed(500)+ " m/s");
        
        //Hoeveel is dat in kilometer per uur? Waar zou je die berekening neerzetten?
    }
}