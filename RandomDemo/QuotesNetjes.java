import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* Deze klasse geeft vooralsnog de beste oplossing. Het vereist wel wat voorbereiding, maar 
 * dan schaalt het direct en is het ook gelijk het snelst. We groeperen de quotes rondom de 
 * taal waarin ze gesteld zijn, voegen die toe aan een tijdelijke ArrayList<String> en *die*
 * ArrayList koppelen we vervolgens aan de sleutel van de HashMap (dus "EN", "NL", "FR", of "DE").
 * 
 * Het type van de sleutel van de HashMap is dus een String (namelijk de taal), en de value van
 * de HashMap is een ArrayList<String>, namelijk de verzameling quotes die bij die taal hoort.
 * Oftewel HashMap<String, ArrayList<String>>
 */


class QuotesNetjes {
    private HashMap<String, ArrayList<String>> quotes = new HashMap<>();
    
    public QuotesNetjes() {
        getQuotes();
        printRandomQuote("DE");
    }
    
    private void printRandomQuote(String lang) {
        Random rnd = new Random();
        ArrayList<String> tmp = quotes.get(lang);
        int idx = rnd.nextInt(tmp.size());
        System.out.println(tmp.get(idx));
    }
    
    
    
    
    private void getQuotes() {
        ArrayList<String> tmpList = new ArrayList<>();
        
        tmpList.add("Noch bei der höchstvollendeten Reproduktion fällt eines aus: das Hier und Jetzt des Kunstwerks – sein einmaliges Dasein an dem Orte, an dem es sich befindet. ");
        tmpList.add("Stimmt es überhaupt daß ein römischer Aquädukt oder eine moderne Autobahnbrücke von ihrem Entstehungsgrund her nichts mit Kunst zu tun haben? ");
        tmpList.add("Entwurf und Strenge, Verfahren und Betrieb, wechselweise sich fordernd, machen das Wesen der neuzeitlichen Wissenschaft aus, machen sie zur Forschung. ");         
        quotes.put("DE", tmpList);
        
        tmpList = new ArrayList<>();
        tmpList.add("Het schijnt dat dat de manier is. Als je plezier hebt kan het geen bliksem schelen; maar een man, die gemeen is en eenzaam en oud en teleurgesteld – die is bang voor de dood. ");
        tmpList.add("Vanwege zijn excentrische positionaliteit is de mens zowel van de wereld als van zijn medemensen en zichzelf door een kloof gescheiden. ");
        tmpList.add("Dat nu, meent Foucault, is de kern van dat hele idee van Verlichting: de eindeloos herhaalde vraag naar het heden, ons heden, mijn heden.");
        tmpList.add("De maatschappij bevindt zich momenteel in dit derde moment.");
        tmpList.add("Ze lachen om mensen die nog naar kieviten kijken als ik. En ze weten niets van de drama's die zich in deze streek afspelen. En als ze het zouden weten, zou het hun niet kunnen schelen. ");
        quotes.put("NL", tmpList);
        
        tmpList = new ArrayList<>();
        tmpList.add("Le mouvement de reconquête catholique éloquemment nommé Contra-Réforme revalorise donc les images et réaffirme leur utilité. ");
        tmpList.add("Cela reviendrai à faire du préhistorien comme l'instrument d'une anamnèse, au sens quasi psychanalytique de terme. ");
        tmpList.add("La Moyen Âge chrétien considère que le beau ne diffère nu du bien ni du vrai, dans la mesure où Dieu est beauté aussi bien que bonté et vérité. ");
        quotes.put("FR", tmpList);
        
        tmpList = new ArrayList<>();
        tmpList.add("As in a real plane, the experience of the game is that of working an interface, so that the immediacy of this experience is pure hypermediacy. ");
        tmpList.add("In an anthropological spirit, then, I propose the following definition of the nation: it is an imagined political community – and imagined as both inherently limited and sovereign. ");
        tmpList.add("According to the theory Heidegger has in mind, the point of the artwork was to represent in a way that highlighted the formal qualities constitutive of beauty, to represent so as to facilitate entry into the aesthetic state. ");
        quotes.put("EN", tmpList);
    }
}