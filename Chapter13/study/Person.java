package lang.thegodofjava.Chapter13.study;

public interface Person {

    void walk();

    void gainedWeight(int weight);

    void losingWeight(int weight);

    public static void main(String[] args) {
        Person student = new Student();
        Person employee = new Employee();

        student.walk();
        employee.walk();
        student.gainedWeight(3);
        employee.gainedWeight(3);
    }
}
