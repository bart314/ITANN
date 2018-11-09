public class Novel extends Book {
    private String title;
    private String author;
    
    public Novel (String title, String author) {
        super(title);
        System.out.println ("In constructor van Novel");
        
        this.title = title;
        this.author = author;
    }
    
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
}
    
    