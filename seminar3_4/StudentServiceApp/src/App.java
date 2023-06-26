import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.TeacherController;
import Services.AverageAge;
import Services.TeacherService;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentDomen.Emploee;
import StudentDomen.Person;
import StudentDomen.PersonComparator;

public class App {
    public static void main(String[] args) {
        //#region students and students list
        Student s1 = new Student("Sergey", "Ivanov", 20, (long)101);
        Student s2 = new Student("Andrey", "Sidorov", 20, (long)102);
        Student s3 = new Student("Ivan", "Petrov", 20, (long)103);
        Student s4 = new Student("Igor", "Ivanov", 23, 301);
        Student s5 = new Student("Dasha", "Tsvetkova", 23, 171);
        Student s6 = new Student("Lena", "Nezabudkina", 28, 108);
        Student s7 = new Student("Vasya", "Dzheday", 22, 777);
        Student s8 = new Student("Vasya", "Muravei", 22, 666);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        //#endregion

        //#region techers and list
        
        Teacher tch1 = new Teacher("Petr", "Ivanonich", 40, 030);
        Teacher tch2 = new Teacher("Stanislav", "Zinkovich", 41, 040);
        Teacher tch3 = new Teacher("Petr", "Igorkov", 30, 552);
        Teacher tch4 = new Teacher("Vyacheslav", "Kartosh", 31, 553);     
        Teacher tch5 = new Teacher("Zenaida", "Petrovna", 50, 554);
        Teacher tch6 = new Teacher("Ilya", "Voronkov", 55, 555);
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(tch1);
        teachers.add(tch2);
        teachers.add(tch3);
        teachers.add(tch4);
        teachers.add(tch5);
        teachers.add(tch6);
        //#endregion

        //#region group of students and lists
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
        //#endregion

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

        //#region comparator
        Student st1 = new Student("Anya", "Svetlakova", 16, 003);
        Student st2 = new Student("Anita", "Svetlaya", 16, 004);
        Person pr1 = new Student("Zoria", "Stasikova", 16, 005);
        Person pr2 = new Teacher("Maksim", "Zeleniy", 40, 050);

        PersonComparator<Student> compSt = new PersonComparator<Student>();
        compSt.compare(st1, st2);
        PersonComparator<Teacher> compTch = new PersonComparator<Teacher>();
        compTch.compare(tch1, tch2);
        PersonComparator<Person> compPer = new PersonComparator<Person>();
        compPer.compare(pr1, pr2);
        //#endregion

        //#region с 4 семинара
        System.out.println("\nSeminar 4: ==================================== Seminar 4:\n");
        Emploee per1 = new Emploee("Boris", "Ivanov", 40, "basic");
        EmploeeController empController = new EmploeeController();
        empController.paySalary(per1);

        EmploeeController.depriveBonus(per1); // обращение к static методу

        // ДЗ 4 семинар <===================================================================>
        // сортировка учителей (Person Comparator)
        System.out.println("\nHomework 4.1\nList of teachers before sorting by First Name: \n");
        for (Teacher teacher : teachers) {       
            System.out.println(teacher.toString());
        }
        System.out.println("\n <<=== сортировка по учителей по возрасту ===>>\n");
        TeacherService teacherService = new TeacherService();
        teacherService.getSortedByNameTeacherList(teachers);
        System.out.println("\nList of teachers after sorting by First Name: \n");
        for (Teacher teacher : teachers) {       
            System.out.println(teacher.toString());
        }

        // действие контроллера TeacherController
        System.out.println("\nTeacherController: \n");
        TeacherController teacherController = new TeacherController();
        teacherController.lessonWasHeld(tch6);
        System.out.println("\n");

        // применение обобщенного метода для подсчета среднего возраста студентов/учителей/рабочих
        AverageAge<Teacher> averageAgeT = new AverageAge<Teacher>();
        int aAgeTeach = averageAgeT.averageAge(teachers);
        System.out.println("Средний возраст учителей: " + aAgeTeach);

        List<Emploee> emploees = new ArrayList<>();
        emploees.add(per1);
        AverageAge<Emploee> averageAgeE = new AverageAge<Emploee>();
        int aAgeEmp = averageAgeE.averageAge(emploees);
        System.out.println("Средний возраст рабочих: " + aAgeEmp);

        
        AverageAge<Student> averageAgeS = new AverageAge<Student>();
        int aAgeStud = averageAgeS.averageAge(students);
        System.out.println("Средний возраст студентов: " + aAgeStud +"\n");

        //#endregion
    }
}
 
