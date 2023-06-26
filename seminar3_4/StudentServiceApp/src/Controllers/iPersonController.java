package Controllers;

import StudentDomen.Person;

public interface iPersonController <T extends Person> {
    void creat(String firstName, String secondName, int age);
}
