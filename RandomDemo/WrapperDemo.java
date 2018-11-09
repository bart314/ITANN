import java.util.ArrayList;

class WrapperDemo {
    private ArrayList<Integer> demo = new ArrayList<>();
    
    public WrapperDemo () {
        //Autoboxing
        // ik kan altijd het primitieve type gebruiken
        // waar ik een wrapper class verwacht.
        demo.add(1);
        demo.add(4);
        int i = 6;
        demo.add(i);       
    }
}
    