public class Book extends Item {
    public Book() {
        System.out.println("Parameterloze constructor in Book.");
    }
    
    
    public Book (String title) {
        System.out.println("Constructor in book met title = " +title);
    }
}