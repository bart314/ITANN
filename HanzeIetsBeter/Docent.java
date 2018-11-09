public class Docent extends Person {
    public Docent (String naam, String code, char geslacht) {
        super (naam, code, geslacht);
        setType("docent");
    }
}