package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    public void update() {
        //view.printAllStudent(model.getAllStudents()); //mvc
        
        //mvp
        getAllStudents();
        if(testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("List of students is empty");
        }
    }

    public void getAllStudents() { //mvp
        students = model.getAllStudents();
    }

    public boolean testData() { //mvp
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Enter command: ");
            com = Commands.valueOf(command.toUpperCase());
            switch(com) {
                case EXIT: 
                    getNewIteration = false;
                    System.out.println("Exit out of programm");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
            }
        }
    }
}
