package services;

import studentDomen.PersonComparator;
import studentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();

    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student person = new Student(firstName, secondName, age, count);
        count++;
        students.add(person);

    }

    public List<Student> getSortedByFIOStudentsList() {
        List<Student> newStudentsList = new ArrayList<>(students);
        students.sort(new PersonComparator<Student>());
        return newStudentsList;
    }

}
