import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Sergey", "Ivanov", 20, (long)101);
        Student s2 = new Student("Andrey", "Sidorov", 20, (long)102);
        Student s3 = new Student("Ivan", "Petrov", 20, (long)103);
        Student s4 = new Student("Igor", "Ivanov", 23, 301);
        Student s5 = new Student("Dasha", "Tsvetkova", 23, 171);
        Student s6 = new Student("Lena", "Nezabudkina", 28, 108);
        Student s7 = new Student("Vasya", "Dzheday", 22, 777);
        Student s8 = new Student("Vasya", "Muravei", 22, 666);


        List<Student> listStudents001 = new ArrayList<Student>();
        listStudents001.add(s1);
        listStudents001.add(s2);
        listStudents001.add(s3);
        listStudents001.add(s7);
        listStudents001.add(s8);
        List<Student> listStudents002 = new ArrayList<Student>();
        listStudents002.add(s4);
        listStudents002.add(s5);
        listStudents002.add(s6);

        StudentGroup group001 = new StudentGroup(listStudents001, 001);
        StudentGroup group002 = new StudentGroup(listStudents002, 002);

        List<StudentGroup> listGroups = new ArrayList<StudentGroup>();
        listGroups.add(group001);
        listGroups.add(group002);
        StudentSteam steam = new StudentSteam(listGroups, 1); // осталось загадкой
        for (StudentGroup group : steam) {                                  // почему №стима 2 в консоли)))
            System.out.println(group.toString());
            for (Student student : group) {
                System.out.println(student);
            }
        }

        System.out.println("\n <<=== сортировка по количеству студентов в группе ===>>\n");
        Collections.sort(steam.getGroups());

        for (StudentGroup group : steam) {
            System.out.println(group.toString());
            for (Student student : group) {
                System.out.println(student);
            } 
        }

    }
}
 
