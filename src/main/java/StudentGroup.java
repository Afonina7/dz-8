import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    private Student groupLeader;
    private final List<Student> students = new ArrayList<>();
    private final List<String> tasks = new ArrayList<>();


    public StudentGroup(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Student changeGroupLeader(Student newGroupLeader) {
        this.groupLeader = newGroupLeader;
        return newGroupLeader;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public boolean addGroupTask(String task) {
        tasks.add(task);
        return false;
    }

    public boolean markTaskAsDone(Student student, String task) {
        if (students.contains(student) && tasks.contains(task)) {
            System.out.println("Завдання " + task + "виконано!");
        }
        return false;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupLeader=" + groupLeader +
                ", students=" + students +
                ", tasks=" + tasks +
                '}';
    }
}

