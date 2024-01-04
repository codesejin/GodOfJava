package lang.thegodofjava.Chapter13.study;

public class FinalFieldPerson {
    final String nation = "Korea";
    final String ssn;
    String name;

    public FinalFieldPerson(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
