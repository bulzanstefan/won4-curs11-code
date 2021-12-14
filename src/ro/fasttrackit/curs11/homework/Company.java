package ro.fasttrackit.curs11.homework;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Person> employees;

    public Company() {
        this(new ArrayList<>());
    }

    public Company(List<Person> employees) {
        this.employees = new ArrayList<>(employees);
    }

    public void employ(Person person) {
        this.employees.add(person);
    }

    public List<Person> getEmployees() {
        return new ArrayList<>(employees);
    }
}
