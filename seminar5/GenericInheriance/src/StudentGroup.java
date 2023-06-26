import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends Comparable<T>, V> implements Iterable <Student<T, V>> {
    private List<Student<T, V>> students;
    private V numberOfGroup;

    public StudentGroup(List<Student<T, V>> students, V numberOfGroup) {
        this.students = students;
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student<T, V>> getStudents() {
        return students;
    }

    public void setStudents(List<Student<T, V>> students) {
        this.students = students;
    }
    
    public V getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(V numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

     @Override
    public Iterator<Student<T, V>> iterator() { // вместо создания класса
        return new Iterator<Student<T, V>>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student<T, V> next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(index++);
            }
        };
    }
    
}
