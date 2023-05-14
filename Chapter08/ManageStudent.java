package lang.thegodofjava.Chapter08;

// https://github.com/godofjava/GodOfJava2nd/blob/master/Chapter08/src/ManageStudent.java
public class ManageStudent {

    public static void main(String[] args) {

        Student[] student;
        ManageStudent manageStudent = new ManageStudent();
        student = manageStudent.addStudent();
        manageStudent.printStudent(student);
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXXX", "ask@godofjava.com");
        return student;
    }

    public void printStudent(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
