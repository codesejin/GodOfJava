package lang.thegodofjava.Chapter08;

// https://github.com/godofjava/GodOfJava2nd/blob/master/Chapter08/src/Student.java

public class Student {

    private String name;

    private String address;

    private String phone;

    private String email;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }
}
