package studentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroutIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    public StudentGroutIterator( List<Student> students) {

        this.students = students;
        this.counter = -1;
    }

    @Override
    public boolean hasNext() {
        return counter<students.size();
    }

    @Override
    public Student next() {
        if(!hasNext()){
            return null;
        }

        return students.get(counter++);
    }
}
