public class Vehicle {
    protected double getSpeed (double toerental, double radius) {
        double rv = (Math.PI*2*radius) * (double)toerental;
        return rv/100;
    }
}

        