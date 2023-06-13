package services;

import studentDomen.Person;

import java.util.List;

public class AverageAge<T extends Person> {


    /**
     * посчитать средний возраст людей в списке
     *
     * @param personList
     * @param <T>
     * @return
     */
    public static <T extends Person> double countInList(List<T> personList) {
        int sumAge = 0;
        for (T person : personList) {
            sumAge += person.getAge();
        }
        return sumAge / personList.size();
    }

}
