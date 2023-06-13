package controllers;

import studentDomen.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, String secondName, int age);
}
