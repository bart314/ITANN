public class StrangeBehaviorOfStringsDemo
{
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private String s6;
    private String s7;
    private String s8;
    
    public StrangeBehaviorOfStringsDemo()
    {
        // creating a String 
        s1="A string";
        // this is a shorthand rule for
        s2=new String("A string");
        // Basically the compiler inserts the new String in front of it,
        // this is the "short hand rule" (only applicable to Strings)
        
        // and what about this then
        s3=new String("Another string");
        s4=new String("Another string");
        
        // and this?
        s5="Yet another string";
        s6="Yet another string";
        
        /** Well I lied with the shorthand rule!
         * The code containing s5 and s6 might translated
         * by the Java compiler as:
         * 
         * (1)
         * s5=new String("Yet another string");
         * s6=new String("Yet another string");
         * 
         * or as a optimized form 
         * (2)
         * s5=new String("Yet another string");
         * s6=s5;
         * 
         * The standard Java compiler will use form (2)! 
         */ 
        s7=new String("Yet another string");
        s8=s7;
    }

    public void testS1S2()
    {
        testStrings(s1, s2);
    }

    public void testS3S4() {
        testStrings(s3, s4);
    }
    
    public void testS5S6() {
        testStrings(s5, s6);
    }
    
    public void testS7S8() {
        testStrings(s7, s8);
    }
    
    private void testStrings(String s, String t) 
    {
        System.out.println("Testing identity: "+(s==t));
        System.out.println("Testing equality: "+s.equals(t));
    }
    
}
