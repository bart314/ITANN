import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

class Demo2 {
    private ArrayList<String> demoList = new ArrayList<>();
    
    Demo2() {
        fillList();
        removePersonWithName("Henk");
    }
    
    public void removePersonWithName(String name) {
        Iterator<String> itr = demoList.iterator();
        while (itr.hasNext() ) {
            String test = itr.next();
            if (test.startsWith(name)) {
                itr.remove();
            }
        }
    }
    
    
   
    
    public void removePersonWithNameLambda(String name) {
        demoList = demoList.stream()
                       .filter( cur -> !cur.startsWith(name) )
                       .collect(Collectors.toCollection(ArrayList::new));
    }
    
    private void fillList() {  
        demoList.add("Klaas-Jan van Henegouwen Wassenear");
        demoList.add("Marnix de Boer Schippers");
        demoList.add("Fabian Jan-Willem Stark van Voorst");
        demoList.add("Henk Klaassen");
        demoList.add("Bert de Vries");
        demoList.add("Henk de Boer");
        demoList.add("Fabian de Boer");       
    }
}