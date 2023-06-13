package controllers;

import services.StudentService;
import studentDomen.Student;

public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName,age);
    }
}
