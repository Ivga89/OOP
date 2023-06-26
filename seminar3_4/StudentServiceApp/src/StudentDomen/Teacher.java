package StudentDomen;

public class Teacher extends Person {
    private int teacherID;

    /**
     * teacher creation
     * @param firstName first name
     * @param secondName second name
     * @param age age
     * @param id teacher id
     */
    public Teacher(String firstName, String secondName, int age, int id) {
        super(firstName, secondName, age);
        this.teacherID = id;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int id) {
        this.teacherID = id;
    }
    
    @Override
    public String toString() {
        return "Second name: " + super.getSecondName() +
               ",\tFirst name: " + super.getFirstName() +
               "\tage: " + super.getAge() +
               "\ttecher id: " + teacherID;
    }
}
