/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.employees.add(person);
        }
    }
    
    public void print() {
        Iterator<Person> person = this.employees.iterator();
        while (person.hasNext()) {
            System.out.println(person.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> person = this.employees.iterator();
        while (person.hasNext()) {
            Person individual = person.next();
            if (individual.getEducation() == education) {
                System.out.println(individual);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> person = this.employees.iterator();
        while (person.hasNext()) {
            if (person.next().getEducation() == education) {
                person.remove();
            }
        }
    }
}
