import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student<String, Integer> s1 = new Student<String, Integer>("Sergey", "Ivanov", 21, 1);
        Student<String, Integer> s2 = new Student<String, Integer>("Ivan", "Petrov", 24, 2);
        Student<String, Integer> s3 = new Student<String, Integer>("Sveta", "Maslyakova", 22, 3);
        List<Student<String, Integer>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        StudentGroup<String, Integer> group = new StudentGroup<String,Integer>(listStud, 4);
        for (Student<String, Integer> student : group) {
            System.out.println(student);
        }

        Collections.sort(group.getStudents());


    }
}
