package StudentDomen;

public class Student extends User implements Comparable<Student> {
    private long studentID;

    /**
     * student creation
     * @param firstName first name
     * @param secondName second name
     * @param age age
     * @param id id number of studen
     */
    public Student(String firstName, String secondName, int age, long id) {
        super(firstName, secondName, age);
        this.studentID = id;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long id) {
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
    public int compareTo(Student o) {
        //System.out.println(super.getFirstName() + " - " + o.getFirstName());
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            }
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;

        } if (super.getAge() < o.getAge()) {
            return -1;
        } return 1;
    }
}
