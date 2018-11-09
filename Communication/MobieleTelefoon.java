import java.util.Random;

public class MobieleTelefoon {
    private Connection connection;
    
    public MobieleTelefoon () {
        int test = new Random().nextInt(100);
        connection = (test < 50) ? new Wifi() : new VierG();
    }
    
    public void getMessage() {
        boolean type = new Random().nextInt(100) < 50 ? true : false;
        String rv = "Bericht ontvangen met snelheid " +connection.getConnectionSpeed();        
        rv += "\n" + connection.getMessage(type).getContent();
        
        System.out.println(rv);
    }
        
}