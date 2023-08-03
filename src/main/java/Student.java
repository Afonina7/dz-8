public class Student {

    private final int studentId;
    private final String firstName;
    private final String lastName;
    private String task;

    public Student(int studentId, String firstName, String lastName, String task) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.task = task;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTask() {
        return task;
    }
}
