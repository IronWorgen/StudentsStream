import controllers.EmployeeController;
import controllers.TeacherController;
import services.AverageAge;
import studentDomen.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Person u1 = new Person("Сергей","Иванов",25, "Москва");
//
//        Student u2 = new Student("Антон","Петров",22, "СПБ", 1);
//        Student u3 = new Student("Стас","Иванов",22, "Москва", 2);
//        Student u4 = new Student("Женя","Сидорова",19, "Калуга", 3);
//        Student u5 = new Student("Маша","Соколова",40, "Мытищи", 4);
//        Student u6 = new Student("Петя","Петя",22, "Москва", 5);
//
//        List<Student> listStudentGroup1 = new ArrayList<>();
//        listStudentGroup1.add(u2);
//        listStudentGroup1.add(u3);
//        listStudentGroup1.add(u4);
//        listStudentGroup1.add(u5);
//        listStudentGroup1.add(u6);
//
//
//
//        StudentGroup group1 = new StudentGroup(1,listStudentGroup1);
//
////        for (Student student : group1) {
////            System.out.println(student);
////        }
//
//        Student g2u2 = new Student("Саня","Сотка",22, "СПБ", 1);
//        Student g2u3 = new Student("Джон","Уик",22, "Москва", 2);
//        Student g2u4 = new Student("Сильвестр","Сталлоне",19, "Калуга", 3);
//
//        List<Student> listStudentGroup2 = new ArrayList<>();
//        listStudentGroup2.add(g2u2);
//        listStudentGroup2.add(g2u3);
//        listStudentGroup2.add(g2u4);
//
//        StudentGroup group2 = new StudentGroup(2,listStudentGroup2);
//
//
//        Student g3u2 = new Student("Джессика","Альба",22, "СПБ", 1);
//        Student g3u3 = new Student("Тони","Старк",22, "Москва", 2);
//        Student g3u4 = new Student("Питер","Паркер",19, "Калуга", 3);
//
//        List<Student> listStudentGroup3 = new ArrayList<>();
//        listStudentGroup3.add(g3u2);
//        listStudentGroup3.add(g3u3);
//        listStudentGroup3.add(g3u4);
//
//        StudentGroup group3 = new StudentGroup(3,listStudentGroup3);
//
//        List<StudentGroup> studentGroups = new ArrayList<>();
//        studentGroups.add(group2);
//        studentGroups.add(group3);
//        studentGroups.add(group1);
//
//        StudentSteam studentSteam =  new StudentSteam(1,studentGroups);
//
//        //вывести через for несколько групп со списком студентов на консоль
//        for (StudentGroup group : studentSteam) {
//            System.out.println(group);
//        }
//
//        // отсортировать группы студентов в потоке, а затем вывести в консоль
//        Collections.sort(studentSteam.getGroupList());
//
//        System.out.println(studentSteam);
//
//        System.out.println("//=========================================================================\n\n");

        Employee per1 = new Employee("Борис", "Иванов", 40, "Москва", "basic");

        EmployeeController.paySalary(per1);

        System.out.println("\nHW----------------");
        TeacherController teacherController = new TeacherController();
        teacherController.create("оби ван", "кеноби", 50);
        teacherController.create("Магистр", "Йода", 100);
        teacherController.create("Канцлер", "палпатин", 80);
        teacherController.create("Мейс", "Винду", 10);

        double avgAge = AverageAge.countInList(teacherController.getTeacherList());

        System.out.printf("Средний возраст = %d лет", (int) avgAge);

    }
}