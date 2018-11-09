import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

class RandomDemo {    
    private static Random rnd = new Random();
    private static ArrayList<String> quotes 
        = new ArrayList<>(Arrays.asList(
            "It was the best of times, it was the worst of times.",
            "So fair and foul a day I have not seen.",
            "Wir liegen neun Kilometer hinter den Front.",
            "Ik ben makelaar in koffie en woon in Den Haag."
          )
        );
    
    private static int previous_index = -9;

    public RandomDemo() {
        quotes.add("It was the best of times, it was the worst of times.");
        quotes.add("So fair and foul a day I have not seen.");
        quotes.add("Wir liegen neun Kilometer hinter den Front.");
        quotes.add("Ik ben makelaar in koffie en woon in Den Haag.");

        System.out.println(getRandomQuote());
    }
    
        
    public static String getRandomQuote() {
        int next;
        String rv = "";
        
        do {
            next = rnd.nextInt(quotes.size());
        } while (previous_index == next);    
        
        rv = quotes.get(next);
        previous_index = next;

        return rv;
    }
}

    
