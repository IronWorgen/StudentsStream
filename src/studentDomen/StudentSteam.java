package studentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    /**
     * номер потока
     */
    private  int numberStream;
    /**
     * список групп
     */
    private List<StudentGroup> groupList;

    public StudentSteam(int numberStream, List<StudentGroup> groupList) {
        this.numberStream = numberStream;
        this.groupList = groupList;
    }

    public int getNumberStream() {
        return numberStream;
    }

    public void setNumberStream(int numberStream) {
        this.numberStream = numberStream;
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }


    /**
     * переопределение метода iterator() чтобы сделать this итерируемым объектом
     * @return
     */
    @Override
    public Iterator iterator() {
        return new Iterator() {
            int counter=0;
            @Override
            public boolean hasNext() {
                return  counter<groupList.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()){
                    return null;
                }
                return groupList.get(counter++);
            }
        };
    }

    @Override
    public String toString() {
        String result  = "Номер потока -> "+ numberStream +"\n";
        result+= "Количество групп = " + groupList.size() + "\n\n";
        for (StudentGroup group : groupList) {
            result+=group;
        }
        return result;
    }
}
