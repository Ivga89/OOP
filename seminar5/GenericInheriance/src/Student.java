public class Student<T extends Comparable<T>, V> extends Person<T, V> implements Comparable<Student<T, V>> {
    private V studentID;

    /**
     * student creation
     * @param firstName first name
     * @param secondName second name
     * @param age age
     * @param id id number of studen
     */
    public Student(T firstName, T secondName, V age, V id) {
        super(firstName, secondName, age);
        this.studentID = id;
    }

    public V getStudentID() {
        return studentID;
    }

    public void setStudentID(V id) {
        this.studentID = id;
    }
    
    @Override
    public String toString() {
        return "Second name " + super.getSecondName() +
               ", First name " + super.getFirstName() +
               ", age " + super.getAge() +
               ", student id " + studentID;
    }

    @Override
    public int compareTo(Student<T, V> o) {
        return super.firstName.compareTo(o.firstName);
    }
}
