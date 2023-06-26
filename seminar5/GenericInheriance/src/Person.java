public class Person<T, V> {
    protected T firstName;
    private T secondName;
    private V age;

    /**
     * user creation
     * @param firstName first name of user
     * @param secondName second name of user
     * @param age age of user
     */
    public Person(T firstName, T secondName, V age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getSecondName() {
        return secondName;
    }

    public void setSecondName(T secondName) {
        this.secondName = secondName;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Second name " + secondName +
               ", First name " + firstName +
               ", age " + age;
    }
}
