package controllers;

import services.TeacherService;
import studentDomen.Teacher;

import java.util.List;

public class TeacherController implements iPersonController<Teacher> {

    TeacherService teacherService = new TeacherService();


    /**
     * добавить учителя
     *
     * @param firstName
     * @param secondName
     * @param age
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        teacherService.create(firstName, secondName, age);
    }

    /**
     * @return список учителей
     */
    public List<Teacher> getTeacherList() {
        return teacherService.getAll();
    }

}
