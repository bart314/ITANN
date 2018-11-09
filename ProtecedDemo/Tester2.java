public class Tester2 {
    public Tester2 () {
        Vehicle c1 = new Car();
        
        if (c1 instanceof Car) System.out.println("car instanceof car");
        if (c1 instanceof Vehicle) System.out.println("car instanceof Vehicle");
    }
}