/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class Country implements Comparable<Country> {
    private String name;
    private String gender;
    private double literacy;
    private int year;
    
    public Country(String name, String gender, double literacy, int year) {
        this.name = name;
        this.gender = gender;
        this.literacy = literacy;
        this.year = year;
    }
    
    public double getLiteracy() {
        return this.literacy;
    }
    
    @Override
    public int compareTo(Country country) {
        
        double compare = this.literacy - country.getLiteracy();
        if (compare < 0) {
            return -1;
        } else if (compare > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.year + "), " + this.gender + ", " + this.literacy;
    }
    
}
