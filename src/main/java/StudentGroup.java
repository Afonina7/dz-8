import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGroup {

    private Student groupLeader;
    private List<Student> students = new ArrayList<>();
    private final List<String> tasks = new ArrayList<>();
    Map<String, List<Student>> completedTasks = new HashMap<>();


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

    public void markTaskAsDone(Student student) {
        String task = student.getTask();
        List<Student> studentsList = completedTasks.get(task);

        if (studentsList == null) {
            studentsList = new ArrayList<>();
            completedTasks.put(task, studentsList);
        }

        studentsList.add(student);
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

