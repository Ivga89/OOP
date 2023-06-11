package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

/**
 * Создаtv класс TeacherController. 
 * Подключвем обобщенный интерфейс iPersonController.
 */
public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService dataService = new TeacherService();

    @Override // перезапись конструктора
    public void creat(String firstName, String secondName, int age) {
        dataService.creat(firstName, secondName, age);
    }

    // метод с обобщенным типом для контроля проведения уроков
    public <T extends Teacher> void lessonWasHeld(T person) { // the Big Brother is watching you
        System.out.println(person.getSecondName() + " провел урок");
    }
    
}
