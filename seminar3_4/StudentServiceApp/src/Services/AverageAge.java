package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Person;

/** обобщенный класс
 * для подсчета среднего возраста
 * наследников Person
 */
public class AverageAge<T extends Person> implements iPersonService<Person> {
    private List<Person> persons;

    public AverageAge() {
        this.persons = new ArrayList<Person>();
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public void creat(String firstName, String secondName, int age) {
        Person per = new Person(firstName, secondName, age);
        persons.add(per);
    }

    /**
     * метод для подсчета возраста
     * @param <T> неизвестный заранее тип
     * @param pList список в котором ведется подсчет
     * @return возвращает интеджер (средний возраст)
     */
    public<T extends Person> int averageAge(List<T> pList) {
        int sum = 0;
        for (int i = 0; i < pList.size(); i++) {
            sum = sum + pList.get(i).getAge();
        }
        return sum / pList.size();
    } 
}
