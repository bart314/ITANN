public abstract class Beer extends Drank  {
    private static final int MAX_AMOUNT = 4;
    private String merk;
    
    public Beer(String merk) {
        this.merk = merk;
    }
    
    public String getMerk() {
        return getType();
    }
    
    public void setMerk(String merk) {
        super.setType(merk);
    }
    
    
}
