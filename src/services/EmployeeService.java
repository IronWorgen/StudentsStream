package services;

import studentDomen.Employee;
import studentDomen.PersonComparator;
import studentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements  iPersonService<Employee> {

    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Employee person = new Employee(firstName,secondName, age);
        employees.add(person);
    }



    public List<Employee> getSortedByFIOEmployeeList (){
        List newEmp = new ArrayList( employees);
        newEmp.sort(new PersonComparator<Employee>());
        return  newEmp;
    }


}
