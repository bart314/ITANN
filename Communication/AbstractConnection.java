public abstract class AbstractConnection implements Connection {
    private Message message;
    
    public Message getMessage (boolean type) {
       message = type ? new SMSMessage() : new WhatsAppMessage();        
       return message;
    }
}