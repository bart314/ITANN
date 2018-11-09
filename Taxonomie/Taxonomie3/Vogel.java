public class Vogel extends Dier {
    private final boolean levendbarend = false;
    private boolean kanvliegen;
    
    public Vogel(boolean vliegen) {
        this.kanvliegen = vliegen;
    }
    
    @Override
    public String showInfo() {
        String rv = "Dit dier is niet levendbarend.\n";
        rv += kanvliegen ? "Maar kan wel vliegen.\n" : 
        "En kan ook nog eens niet vliegen.\n";
        
        return rv;
    }
        
    public boolean getLevendBarend() { return this.levendbarend; }
    public boolean getKanvliegen() { return this.kanvliegen; }
}