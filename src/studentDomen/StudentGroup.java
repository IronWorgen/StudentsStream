package studentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    /**
     * номер группы
     */
    private int groupNumber;
    /**
     * список студентов
     */
    private List<Student> students;

    public StudentGroup(int groupNumber, List<Student> students) {
        this.students = students;
        this.groupNumber= groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * переопределение метода iterator() чтобы сделать this итерируемым объектом
     * @return
     */
    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>() {
            int counter;
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
        };
    }


    /**
     * метод указывает параметры для сортировки при вызове Collections.sort()
     * сортировка сначала по кол-ву студентов в порядке убывания, потом по номеру группы
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
        //сортировка по кол-ву студентов
        if (this.students.size()>o.getStudents().size()){
            return  -1;
        }
        if (this.students.size()==o.getStudents().size()){
            //сортировка по номеру группы
            if (this.groupNumber<o.getGroupNumber()){
                return -1;
            }
            if (this.groupNumber==o.getGroupNumber()){
                return 0;
            }
            return 1;
        }

        return 1;
    }

    @Override
    public String toString() {
        String result = "ГРУППА № " + this.getGroupNumber() + "\n";
        result+="Количество студентов = "+students.size()+ "\n";
        result+="Список студентов:\n";
        for (Student student : students) {
            result+=student+"\n";
        }

        return result;
    }
}
