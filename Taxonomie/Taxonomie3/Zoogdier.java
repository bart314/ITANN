public class Zoogdier extends Dier {
    private final boolean levendbarend = true;
    private int aantal_voeten;
    
    public Zoogdier(int voeten) {
        this.aantal_voeten = voeten;
    }
    
    @Override 
    public String showInfo() {
        return "Dit dier is levendbarend.";
    }
    
    public boolean levendBarend() { return this.levendbarend; }
    public int getAantal_voeten() { return this.aantal_voeten; }
}