public class Bier extends Drank {
    private static final int MAX_AMOUNT = 2;
    private String merk;
    
    public Bier(String merk) {
        this.merk = merk;
        setType("bier");
    }
        
    @Override
    public String drink (int amount) {
        if (amount < MAX_AMOUNT) {
            super.drink(amount);
        } else {
            System.out.println("U heeft al genoeg biertjes gehad");
        }
        return "Cheers";
    }
    
    public String getMerk() { return merk;}
    public void setMerk(String merk) { this.merk=merk; }
}
