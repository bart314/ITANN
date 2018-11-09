public class Student extends Person {
    public Student (String naam, String code, char geslacht) {
        super (naam, code, geslacht);
        setType("student");
    }
}