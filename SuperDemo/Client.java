public class Client {
    public Client() {
        Car car = new Car();
        Bicycle bike = new Bicycle();

        System.out.println(car.getSpeed(10));
        System.out.println(bike.getSpeed(3));
    }
}
