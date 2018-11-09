public enum BetterPlanet {  
    /* Each enum constant is declared with values for the mass and 
     * radius parameters. These values are passed to the constructor 
     * when the constant is created. Java requires that the constants 
     * be defined first, prior to any fields or methods. Also, when 
     * there are fields and methods, the list of enum constants must 
     * end with a semicolon.
   */
   
    MERCURIUS (3.303e+23, 2.4397e6),
    VENUS    (4.869e+24, 6.0518e6),
    AARDE    (5.976e+24, 6.37814e6),
    MARS     (6.421e+23, 3.3972e6),
    JUPITER  (1.9e+27,   7.1492e7),
    SATURNUS (5.688e+26, 6.0268e7),
    URANUS   (8.686e+25, 2.5559e7),
    NEPTUNUS (1.024e+26, 2.4746e7);
    
    /*
    Note: The constructor for an enum type must be package-private 
    or private access. It automatically creates the constants that 
    are defined at the beginning of the enum body. You cannot invoke 
    an enum constructor yourself.
    */
    
    private final double massa;
    private final double radius;
    // universele gravitatieconstante  ( Nm^2 kg^−2)
    public static final double G = 6.67300E-11;
    
    BetterPlanet(double massa, double radius) {
        this.massa = massa;
        this.radius = radius;
    }
    
    private double massa() { return massa; }
    private double radius() { return radius; }
    
    double surfaceGravity() {
        return G * massa / (radius * radius);
    }
    
    
    double surfaceWeight(double othermassa) {
        // Methode van Cavendish: de gravitatie tussen twee 
        // objecten:
        // \[ F = G\frac{m_1 x m_2}{r^2} \]
        
        return othermassa * surfaceGravity();
    }
}