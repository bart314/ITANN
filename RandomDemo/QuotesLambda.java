import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.Collectors;

 /*
     * Een aantal mensen had de key-values omgedraaid, dus de key was de quote en de value was de taal
     * waarin deze was gesteld. Op zich niet heel handig, maar om didactische doeleinden heb ik deze toch
     * even op twee verschillende manieren uitgewerkt. Deze klasse is het resultaat hiervan
     * 
 */

class QuotesLambda {
    private HashMap<String, String> quotes = new HashMap<>();
    
    public QuotesLambda() {
        GetQuotes();
        printRandomQuoteLambda2("NL");
    }
    
    /* printRandomQuoteLambda1
     * -----------------------
     * Het idee van deze methode is om door de HashMap heen te itereren en per iteratie te kijken of de taal die als 
     * value meekomt gelijk is aan de parameter 'lang' die gevraagd wordt. Als dat zo is, stoppen we de quote (dus de 
     * key van de huidige iteratie) in de tijdelijke variabele tmpQuotes. Aan het eind printen we dan een willekeurig
     * element hieruit af.
     */
    private void printRandomQuoteLambda1 (String lang) {
        ArrayList<String> tmpQuotes = new ArrayList<>();
        Random rnd = new Random();
        quotes.forEach( (k, v) -> { if (v.equals(lang)) tmpQuotes.add(k); } );
        
        int idx = rnd.nextInt(tmpQuotes.size()); 
        System.out.println(tmpQuotes.get(idx));
    }

   /* printRandomQuoteLambda2
    * -----------------------
    * Deze methode maakt gebruik van een stream op de quotes-hashmap. Deze wordt gefilterd op de waarde van de hashmap
    * (door middel van de methode getValue() ) en vervolgens wordt alleen de key hieruit gehaal (door middel van de map 
    * en dan e.getKey() ).
    * 
    * Er is in de stream-interface ook een methode getAny(), maar die kun je niet gebruiken om een random waarde uit een
    * verzameling te halen. Check de onderstaande link voor meer informatie hierover;
    * 
    * https://stackoverflow.com/questions/25912185/java-8-stream-findany-vs-finding-a-random-element-in-the-stream
    */
    
    private void printRandomQuoteLambda2 (String lang) {            
        Random rnd = new Random();
        
        ArrayList<String> tmpQuotes = quotes.entrySet().stream()
          .filter ( e -> e.getValue().equals(lang) )
          .map ( e -> e.getKey() )
          .collect(Collectors.toCollection(ArrayList::new));
          
        int idx = rnd.nextInt(tmpQuotes.size()); 
        System.out.println(tmpQuotes.get(idx));
   }
    
    
    private void GetQuotes() {
        quotes.put("Noch bei der höchstvollendeten Reproduktion fällt eines aus: das Hier und Jetzt des Kunstwerks – sein einmaliges Dasein an dem Orte, an dem es sich befindet.", "DE");
        quotes.put("In an anthropological spirit, then, I propose the following definition of the nation: it is an imagined political community – and imagined as both inherently limited and sovereign.", "EN");
        quotes.put("As in a real plane, the experience of the game is that of working an interface, so that the immediacy of this experience is pure hypermediacy.", "EN");
        quotes.put("Dat nu, meent Foucault, is de kern van dat hele idee van Verlichting: de eindeloos herhaalde vraag naar het heden, ons heden, mijn heden.", "NL");
        quotes.put("Le mouvement de reconquête catholique éloquemment nommé Contra-Réforme revalorise donc les images et réaffirme leur utilité.", "FR");
        quotes.put("Cela reviendrai à faire du préhistorien comme l'instrument d'une anamnèse, au sens quasi psychanalytique de terme.", "FR");
        quotes.put("Vanwege zijn excentrische positionaliteit is de mens zowel van de wereld als van zijn medemensen en zichzelf door een kloof gescheiden.", "NL");
        quotes.put("Stimmt es überhaupt daß ein römischer Aquädukt oder eine moderne Autobahnbrücke von ihrem Entstehungsgrund her nichts mit Kunst zu tun haben?", "DE");
        quotes.put("Entwurf und Strenge, Verfahren und Betrieb, wechselweise sich fordernd, machen das Wesen der neuzeitlichen Wissenschaft aus, machen sie zur Forschung.", "DE");  
        quotes.put("Het schijnt dat dat de manier is. Als je plezier hebt kan het geen bliksem schelen; maar een man, die gemeen is en eenzaam en oud en teleurgesteld – die is bang voor de dood.", "NL");
        quotes.put("De maatschappij bevindt zich momenteel in dit derde moment.", "NL");
        quotes.put("According to the theory Heidegger has in mind, the point of the artwork was to represent in a way that highlighted the formal qualities constitutive of beauty, to represent so as to facilitate entry into the aesthetic state.", "EN");
        quotes.put("Ze lachen om mensen die nog naar kieviten kijken als ik. En ze weten niets van de drama's die zich in deze streek afspelen. En als ze het zouden weten, zou het hun niet kunnen schelen.", "NL");
        quotes.put("La Moyen Âge chrétien considère que le beau ne diffère nu du bien ni du vrai, dans la mesure où Dieu est beauté aussi bien que bonté et vérité.", "FR");
    }
}