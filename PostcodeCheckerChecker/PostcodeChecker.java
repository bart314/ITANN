 



class PostcodeChecker {
    
    public PostcodeChecker() {
        System.out.println((int)'爱');
    }
    
    public static boolean validPostcode (String invoer) {
        invoer = invoer.replaceAll("\\s", "");
        if (invoer.length() != 6)  return false;
        if (invoer.startsWith("0")) return false;
        invoer = invoer.toUpperCase();
        // 1234AA
        // AAAA11
        String numPart = invoer.substring(0,3);
        String letterPart = invoer.substring(4,5);
        
        for (int i=0; i<numPart.length(); i++) {
            int test = (int)invoer.charAt(i);
            if (test>127) return false;
            if (test < (int)'0' || test > (int)'9') return false;
        }
        
        for (int i=0; i<letterPart.length(); i++) {
            int test = (int)letterPart.charAt(i);
            if (test < (int)'A' || test > (int)'Z') return false;
        }
        
        return true;
    }
}