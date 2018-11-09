import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

class Demo {
    public Demo() {        
        ArrayList<String> demoList = fillList();  
        // printListStandaard(demoList);
        // printListStandaard(getAllHenksNormal(demoList));
        printListLambda(getAllHenksLambda(demoList));
    }
    
    private void printListStandaard(List<String> value) {        
        //Eerste iteratie: standaard zoals we die kennen
        Iterator<String> itr = value.iterator();
        while (itr.hasNext()) {
            String cur = itr.next();
            System.out.println(cur);
        }
    }
    
    
    
    private void printListLambda(List<String> value) {
        // maar sinds Java 8 kan het ook op een andere manier:        
        value.forEach( System.out::println );        
    }
    
    public void print (String cur) {
        System.out.println(cur);
    }
    
    
    
    
    
    
    private ArrayList<String> getAllHenksNormal(ArrayList<String> value) {
        ArrayList<String> rv = new ArrayList<>();
        
        Iterator<String> itr = value.iterator();
        while (itr.hasNext()) {
            String cur = itr.next();
            if (cur.startsWith("Henk")) rv.add(cur);
        }
        
        return rv;
    }
    
    
    
    
    
    
    private List<String> getAllHenksLambda(ArrayList<String> value) {
        return value.stream()
                    .filter ( cur -> cur.startsWith("Henk") )
                    .collect(Collectors.toList());
    }
    
    
    
    private ArrayList<String> fillList() {
        ArrayList<String> rv = new ArrayList<>();
        
        rv.add("Klaas-Jan van Henegouwen Wassenear");
        rv.add("Marnix de Boer Schippers");
        rv.add("Fabian Jan-Willem Stark van Voorst");
        rv.add("Henk Klaassen");
        rv.add("Bert de Vries");
        rv.add("Henk de Boer");
        rv.add("Fabian de Boer");
        
        return rv;
    }
}