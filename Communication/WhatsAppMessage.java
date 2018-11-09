import java.util.HashMap;

public class WhatsAppMessage implements Message {
    public String getContent() {
        return "Bericht van WhatsApp";
    }

    public HashMap<String, String> getHeaders() {
        HashMap<String, String> rv = new HashMap<>();
	rv.put("content-type", "text/whatsapp");
	rv.put("content-length", "160Bytes");

	return rv; 
    } 
}
