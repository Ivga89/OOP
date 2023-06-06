package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    private static int numberOfSteam;
    private List<StudentGroup> groups;

    /**
     * создание потока с группами
     * @param groups список групп
     * @param numberOfSteam номер потока
     */
    public StudentSteam (List<StudentGroup> groups, int numberOfSteam) {
        this.groups = groups;
        this.numberOfSteam = groups.size();
    }

    public static int getNumberOfSteam() {
        return numberOfSteam;
    }

    public void setNumberOfSteam(int numberOfSteam) {
        this.numberOfSteam = numberOfSteam;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    
    @Override //класс StudentSteam делаем Itarable что бы в нем перебрать группы
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < groups.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext()) {
                    return null;
                } return groups.get(index++);
            }
        };
    }
}
