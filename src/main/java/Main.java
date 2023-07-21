import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup(new Student(1, "Vova", "Lvov"));

        Student leader = studentGroup.changeGroupLeader(new Student(2, "Ivan", "Bohyn"));

        Student newLeader = studentGroup.changeGroupLeader(new Student(3, "Nik", "Ivanov"));

        System.out.println("Leader ID is: " + leader.getStudentId() + "\n" + "First name is: " + leader.getFirstName()
                + "\n" + "Last name is: " + leader.getLastName());

        System.out.println("");

        System.out.println("New Leader ID is: " + newLeader.getStudentId() + "\n" + "First name is: " + newLeader.getFirstName()
                + "\n" + "Last name is: " + newLeader.getLastName());

        //Adding student
        studentGroup.addStudent(new Student(4, "Jhon", "Ivanov"));
        studentGroup.addStudent(new Student(5, "Bob", "Ivanov"));
        studentGroup.addStudent(new Student(6, "Mike", "Ivanov"));
        studentGroup.addStudent(new Student(7, "Olof", "Ivanov"));

        //Removing student
        studentGroup.removeStudent(new Student(7, "Olof", "Ivanov"));

        //Adding task for group
        studentGroup.addGroupTask("Task for group");

        //Mark task is done for student
        studentGroup.markTaskAsDone(new Student(4, "Jhon", "Ivanov"), "Вивчити інкапсуляцію");
    }
}

