package Controllers;

import Services.StudentService;
import StudentDomen.Student;

public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    @Override
    public void creat(String firstName, String secondName, int age) {
        dataService.creat(firstName, secondName, age);
    }
    
}
