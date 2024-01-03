package lang.thegodofjava.Chapter04;

public class ProfilePrint {
    private byte age;
    private String name;
    private boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        profilePrint.setAge((byte) 31);
        profilePrint.setName("박세진");
        profilePrint.setMarried(false);
        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.isMarried());
    }
}
