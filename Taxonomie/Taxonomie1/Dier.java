class Dier {
    int aantalvoeten;
    String naam;
    boolean levendbarend;
    
    Dier(int voeten) {
        this.aantalvoeten = voeten;
    }
    
    void print() {
        System.out.println("Dit dier heet "+naam);
        System.out.println("Hij heeft " +aantalvoeten+ " voeten.");
        System.out.println("Het is een levendbarend dier.");
        System.out.println("");
    }
    
    void setDierNaam(String naam) {
        this.naam = naam;
    }
}
        
        