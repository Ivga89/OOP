package Controllers;

import Services.EmploeeService;
import StudentDomen.Emploee;

public class EmploeeController implements iPersonController<Emploee> {

    private final EmploeeService empService = new EmploeeService();
    @Override
    public void creat(String firstName, String secondName, int age) {
        empService.creat(firstName, secondName, age);
    }

    public <T extends Emploee> void paySalary(T person) {
        System.out.println(person.getFirstName() + " выплачена зарплата 10000р.");
    }

    static public <T extends Emploee> void depriveBonus(T person) {
        System.out.println(person.getFirstName() + " работник лишен премии в размере 10%.");
    }
    
}
