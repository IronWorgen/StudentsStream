package controllers;

import services.EmployeeService;
import studentDomen.Employee;
import studentDomen.Person;

public class EmployeeController implements iPersonController<Employee> {
    private final EmployeeService employeeService = new EmployeeService();

    @Override
    public void create(String firstName, String secondName, int age) {
        employeeService.create(firstName, secondName, age);
    }

    static public <T extends Employee> void paySalary(T person) {
        System.out.println(person.getFirstName() + " ЗП = 10к руб.");
    }
}
