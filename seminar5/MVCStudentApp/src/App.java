import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.Model;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
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

        FileModel fModel = new FileModel("StudentsDB.txt");
        //fModel.saveAllStudentsToFile(students);

        iGetModel model = new Model(students);
        iGetModel newFModel = fModel;
        iGetView view = new View();

        Controller controller = new Controller(view, newFModel);
        //controller.update();
        controller.run();
    }
}
