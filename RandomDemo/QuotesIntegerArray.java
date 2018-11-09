import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Arrays;

/* De opgave was om uit de HashMap hieronder een random quote te genereren die hoorde bij een bepaalde
 * taal (EN, DE, FR of NL). De meest voor hand liggende optie lijkt om een HashMap te maken waarbij de key
 * de string van de taal is, en de value de quote zelf. Het probleem met *die* oplossing is echter dat er in 
 * een HashMap niet twee keer dezelfde key kan voorkomen, dus hoe zorg je ervoor dat alle Engelstalige citaten
 * via dezelfde key ('EN') te benaderen zijn?
 * 
 * Een mogelijke oplossing is om de indexen van de quotes in de bepaalde taal separaat op te slaan in een 
 * ArrayList<Integer>. In deze klasse wordt dat idee uitgewerkt.
 */

class QuotesIntegerArray {
    private ArrayList<String> quotes = new ArrayList<>();
    private HashMap<String, ArrayList<Integer>> indexen = new HashMap<>();
    private HashMap<String, ArrayList<String>> foo;
    
    public QuotesIntegerArray() {
        GetQuotes();
        indexen.put("DE", new ArrayList<Integer>(Arrays.asList(0, 7, 8)));
        indexen.put("NL", new ArrayList<Integer>(Arrays.asList(1, 3, 6, 9, 10, 12)));
        indexen.put("FR", new ArrayList<Integer>(Arrays.asList(5, 4, 13)));
        indexen.put("EN", new ArrayList<Integer>(Arrays.asList(1, 2, 11)));
    }

    //deze klasse moet je voor de opgave uitbreiden of aanpassen. 
    //let op: een HashMap kan geen dubbele key's bevatten: welke waarden ga je in je HashMap opslaan?

    public void printRandomQuote (String lang) {
        ArrayList<Integer> foo = indexen.get(lang);
        int rnd = new Random().nextInt(foo.size());
        System.out.println(quotes.get(rnd));
    }

    public void GetQuotes() {
        quotes.add("Noch bei der höchstvollendeten Reproduktion fällt eines aus: das Hier und Jetzt des Kunstwerks – sein einmaliges Dasein an dem Orte, an dem es sich befindet. ");
        quotes.add("In an anthropological spirit, then, I propose the following definition of the nation: it is an imagined political community – and imagined as both inherently limited and sovereign. ");
        quotes.add("As in a real plane, the experience of the game is that of working an interface, so that the immediacy of this experience is pure hypermediacy. ");
        quotes.add("Dat nu, meent Foucault, is de kern van dat hele idee van Verlichting: de eindeloos herhaalde vraag naar het heden, ons heden, mijn heden.");
        quotes.add("Le mouvement de reconquête catholique éloquemment nommé Contra-Réforme revalorise donc les images et réaffirme leur utilité. ");
        quotes.add("Cela reviendrai à faire du préhistorien comme l'instrument d'une anamnèse, au sens quasi psychanalytique de terme. ");
        quotes.add("Vanwege zijn excentrische positionaliteit is de mens zowel van de wereld als van zijn medemensen en zichzelf door een kloof gescheiden. ");
        quotes.add("Stimmt es überhaupt daß ein römischer Aquädukt oder eine moderne Autobahnbrücke von ihrem Entstehungsgrund her nichts mit Kunst zu tun haben? ");
        quotes.add("Entwurf und Strenge, Verfahren und Betrieb, wechselweise sich fordernd, machen das Wesen der neuzeitlichen Wissenschaft aus, machen sie zur Forschung. ");  
        quotes.add("Het schijnt dat dat de manier is. Als je plezier hebt kan het geen bliksem schelen; maar een man, die gemeen is en eenzaam en oud en teleurgesteld – die is bang voor de dood. ");
        quotes.add("De maatschappij bevindt zich momenteel in dit derde moment.");
        quotes.add("According to the theory Heidegger has in mind, the point of the artwork was to represent in a way that highlighted the formal qualities constitutive of beauty, to represent so as to facilitate entry into the aesthetic state. ");
        quotes.add("Ze lachen om mensen die nog naar kieviten kijken als ik. En ze weten niets van de drama's die zich in deze streek afspelen. En als ze het zouden weten, zou het hun niet kunnen schelen. ");
        quotes.add("La Moyen Âge chrétien considère que le beau ne diffère nu du bien ni du vrai, dans la mesure où Dieu est beauté aussi bien que bonté et vérité. ");
    }
}