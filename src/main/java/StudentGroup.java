import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGroup {

    private Student groupLeader;
    private List<Student> students = new ArrayList<>();
    private final List<String> tasks = new ArrayList<>();
    Map<List<Student>, String> completedTasks = new HashMap<>();


    public StudentGroup(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Student changeGroupLeader(Student newGroupLeader) {
        this.groupLeader = newGroupLeader;
        return newGroupLeader;
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("This student is already exist! You are can't add him.");
        }
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        if (student == groupLeader) {
            System.out.println("You are can't remove this student because he is a Group Leader!");
        } else {
            this.students.remove(student);
        }
    }

    public boolean addGroupTask(String task) {
        tasks.add(task);
        return false;
    }

    public void markTaskAsDone(Student student, String task) {
        if (students.contains(student) && this.tasks.contains(task)) {
            completedTasks.put(students, task);
            System.out.println("Завдання " + task + " виконано!");
        } else {
            System.out.println("Завдання " + task + " поки що НЕ виконано!");
        }
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

