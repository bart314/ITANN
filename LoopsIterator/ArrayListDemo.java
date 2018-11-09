import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    private ArrayList<String> schrijvers = new ArrayList<>();
    
    public ArrayListDemo() {        
        schrijvers.add("Van Aken");
        schrijvers.add("Van Tol");
        schrijvers.add("Coupland");
        schrijvers.add("Remarque");
        schrijvers.add("Goethe");
        schrijvers.add("Latour");
        schrijvers.add("Ten Bos");
        schrijvers.add("管谟业");
        
        String value = getAllSchrijversAsString();
        System.out.println(value);
    }
    
    
    public void voegSchrijverToe(String sch) {
        schrijvers.add(sch);
    }
    
    public String getSchrijver(int index) {
        if (index < schrijvers.size()) {
            return schrijvers.get(index);
        }
        return null;
    }
    
 
    public String getAllSchrijversAsString() {
        String rv = "";
        // mogelijkheid 1: met een eenvoudige for-lus
        for (int i=0; i<schrijvers.size(); i++){
           rv = rv + schrijvers.get(i) + "; ";
        }
        
        
        // mogelijkheid 2: met een enhanced for-lus
        for (String sch: schrijvers) {
           //rv += sch + ";";
        }
        
        
        // mogelijkheid 3: met een iterator
        Iterator<String> itr = schrijvers.iterator();
        while (itr.hasNext()) {
            String foo = itr.next();
            rv += foo + ";";
        }
        
        return rv; 
    }
}

