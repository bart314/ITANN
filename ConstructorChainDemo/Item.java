public class Item {
    public Item () {
        System.out.println("Parameterloze constructor in Item.");
    }
    
    public Item (String value) {
        System.out.println("Constructor in Item met value = " +value);
    }
    
    public String getDemoValue() {
        return "Awesome demovalue";
    }
}
