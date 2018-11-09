public class Beer extends Drank {
    private static final int max_amount = 4;
    private String merk;
    
    public Beer(String merk) {
        this.merk = merk;
    }
    
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk=merk; }
    
    @Override
    public void drink (int amount) {
        if (amount>max_amount) {
            Settings.show("U heeft al genoeg " +merk+ " gehad!");
        }else{
            Settings.show(amount + " glazen " +merk+" gedronken.");
        }
    }
    
    
    @Override
    public String toString(){
        //String foo = super.toString();
        return "Een biertje van het merk " +merk; //+ " :: " +foo;
    }
}
