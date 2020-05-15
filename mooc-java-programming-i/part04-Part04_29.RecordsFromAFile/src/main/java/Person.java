/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        if (this.age == 1) {
            return this.name + ", " + "age: " + this.age + " year";
        } else {
            return this.name + ", " + "age: " + this.age + " years";
        }
        
    }
}
