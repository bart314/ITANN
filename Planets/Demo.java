class Demo {
    public void simpleDemo() {
        for (Planet p: Planet.values()) {
            System.out.println(p);
        }
    }
    
    
    public void betterDemo() {
        double earthWeight = 80;
        double mass = earthWeight/BetterPlanet.AARDE.surfaceGravity();
        
        for (BetterPlanet p : BetterPlanet.values()) {
           System.out.printf("Uw gewicht op %s is %.2f kilo%n",
                             p, p.surfaceWeight(mass));
        }
    }
}