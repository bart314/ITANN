public class Tester {
    public Tester() {
        // Dit compileert niet; we kunnen er niet van uitgaan dat het Object dat we 
        // aanmaken werkelijk een String is
        //  compile-time: linkerkant van het is-gelijkteken
        //  run-time: rechterkant van het is-gelijkteken        
        Object demo1 ="Hallo";
        //String s1 = demo1;
        
        // We kunnen de compiler er wel van overtuigen dat we wel degelijk met een 
        // String te maken hebben -> casting        
        Object demo2 = "Hallo";
        String s = (String)demo2;
        
        // Het volgende compileert wel, maar geeft in run-time een error
        // omdat we een boolean niet naar een string kunnen casten
        Object demo3 = Boolean.FALSE;
        String s2 = (String)demo3;
        
        // linkerkant  -> STATISCHE DATATYPE
        // rechterkant -> DYNAMISCHE DATATYPE
    }
}

        
        
      