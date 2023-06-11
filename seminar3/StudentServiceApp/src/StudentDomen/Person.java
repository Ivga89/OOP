package StudentDomen;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    /**
     * user creation
     * @param firstName first name of user
     * @param secondName second name of user
     * @param age age of user
     */
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Second name " + secondName +
               ", First name " + firstName +
               ", age " + age;
    }
}
