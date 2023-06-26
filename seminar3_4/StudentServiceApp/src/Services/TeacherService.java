package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

/**
 * Создаем класс TeacherService. 
 * Подключить обобщенный интерфейс iPersonService
 */
public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void creat(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, count);
        count++;
        teachers.add(per);
    }

    /**
     * метод вывода списка учителей отсортированного обобщенным классом UserComparator
     * @param teachers список учителей
     * @return teachers
     */
    public List<Teacher> getSortedByNameTeacherList(List<Teacher> teachers) {
        //List<Teacher> teachersSortedByAge = new ArrayList<Teacher>();
        teachers.sort(new PersonComparator<Teacher>());
        return teachers; 
    } 
    
}
