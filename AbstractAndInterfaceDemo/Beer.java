public class Beer extends Drank implements VerdovendMiddel, Gezelligheid {
    private static final int max_amount = 4;
    private String merk;
    
    public Beer(String merk) {
        this.merk = merk;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk=merk;
    }
    
    public boolean addicted (int amount) {
        return (amount>5);
    }
        
    
    public boolean nietMeerGezellig(int amount) {
        return amount > max_amount;
    }
    
    @Override
    public void drink (int amount) {
        Settings.show(getType());
        if (amount>max_amount) {
            Settings.show("U heeft al genoeg " +merk+ " gehad!");
        }else{
            Settings.show(amount + " glazen " +merk+" gedronken.");
        }
    }
}
