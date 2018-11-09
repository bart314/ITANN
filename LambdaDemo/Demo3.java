import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

class Demo3 {
    private ArrayList<String> demoList = new ArrayList<>();
    
    Demo3() {
        fillList();
    }
    
    public int getTotalTraditional(String name) {
        int tot = 0;
        for (String str: demoList) {
            if (str.startsWith(name)) tot++;
        }
        
        return tot;
    }
    
    public long getTotalLambda(String name) {
        return demoList.stream()
                .filter ( cur -> cur.startsWith(name) )
                .count();
        // Java8 heeft een set van zogenaamde 'terminal operations';
        // dingen als sum(), min(), max() en count(). Daarnaast kunnen
        // we met de functie 'reduce()' ook onze eigen terminal-operations
        // schrijven. 
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
