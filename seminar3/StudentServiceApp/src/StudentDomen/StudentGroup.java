package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable <Student>, Comparable<StudentGroup>{
    private List<Student> students;
    private int numberOfGroup;

    public StudentGroup(List<Student> students, int numberOfGroup) {
        this.students = students;
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() { // вместо создания класса
        return new Iterator<Student>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return "steam № " + StudentSteam.getNumberOfSteam() + 
                ", group № " + numberOfGroup;
    }

    @Override // класс StudentGroup делаем Comparable, что бы сравнить группы
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.students.size()) {
            return 0;
        }
        if (this.students.size() < o.students.size()) {
            return -1;
        }
        return 1;
    }




    
}
