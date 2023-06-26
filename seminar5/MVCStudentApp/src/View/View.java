package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView {
    public void printAllStudents(List<Student> students) {
        System.out.println("------------Output of the list of students--------------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------End of the list--------------");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
