package services;

import studentDomen.PersonComparator;
import studentDomen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    /**
     * список учителей
     */
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    /**
     * @return список учителей
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * добавить нового учителя в список
     *
     * @param firstName
     * @param secondName
     * @param age
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        teachers.add(new Teacher(firstName, secondName, age, null));
    }

    /**
     * сортировка списка учителей методом писанным в PersonComparator
     *
     * @return отсортированный список
     */

    public List<Teacher> getSortedByFIOStudentsList() {
        List<Teacher> newList = new ArrayList<>(teachers);
        newList.sort(new PersonComparator<Teacher>());

        return newList;

    }
}
