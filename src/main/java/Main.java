
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Jhon", "Khonor", "вивчити інкапсуляцію");
        Student student2 = new Student(2, "Bob", "Cool", "Do something");
        Student student3 = new Student(3, "Gray", "Mors", "Do something");
        Student student4 = new Student(4, "Alex", "Borovich", "Do something");
        Student student5 = new Student(5, "Faust", "Grou", "Do something");

        StudentGroup studentGroup = new StudentGroup(student5);

        Student newLeader = studentGroup.changeGroupLeader(student4);

        System.out.println("Leader ID is: " + student5.getStudentId() + "\n" + "First name is: " + student5.getFirstName()
                + "\n" + "Last name is: " + student5.getLastName());

        System.out.println("");

        System.out.println("New Leader ID is: " + newLeader.getStudentId() + "\n" + "First name is: " + newLeader.getFirstName()
                + "\n" + "Last name is: " + newLeader.getLastName());

        //Adding student
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        //Removing student
        studentGroup.removeStudent(student4);

        //Adding task for group
        studentGroup.addGroupTask("Task for group");

        //Mark task is done for student
        studentGroup.markTaskAsDone(student1);
        studentGroup.markTaskAsDone(student2);
    }
}

