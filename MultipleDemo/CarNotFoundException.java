public class CarNotFoundException extends Exception {
    private String message;
    
    public CarNotFoundException (String msg) {
        this.message = msg;
    }
    
    @Override
    public String toString() {
        return message;
    }
    
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}