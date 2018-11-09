import java.util.HashMap;

class MapsDemo {
    private HashMap<String, String> docentdata = new HashMap<>();
    
    public MapsDemo() {
        docentdata.put("BABA", "Bart Barnard");
        docentdata.put("PART", "Arthur Perton");
        docentdata.put("ZITI", "Tim Zijlstra");
        docentdata.put("NIOB", "Obbert Nieuwenhuis");
    }
    
    public String getDocentNaam(String key){
        return docentdata.get(key);
    }
}
        