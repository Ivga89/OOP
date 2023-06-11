package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.PersonComparator;

public class EmploeeService implements iPersonService<Emploee> {
    private List<Emploee> emploees;
    
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    @Override
    public void creat(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, "basic");
        emploees.add(per);
    }
    
    public List<Emploee> getSortedByFIOEmploeesList() {
        List<Emploee> emploeesSortedByFIO = new ArrayList<Emploee>(emploees);
        emploeesSortedByFIO.sort(new PersonComparator<Emploee>());
        return emploeesSortedByFIO;
    }
}
