public class Loops {
    
    public Loops() {
        demoDoWhileLoop();
    }
    
    public void demoSimpleLoop() {
        for (int i=0; i<10; i++){
            System.out.println("hallo "+i);
        }
    }
    
    public void demoWhileLoop() {
        int i = 0;
        int tot = 0;
        while (i<10) {
            System.out.println("hallo "+i);         
            i++;
            tot += i;
        }
    }
    
    public void demoDoWhileLoop() {
        int i=0;
        do {
            System.out.println("hallo" + i);
        } while (++i<10);
    }
}