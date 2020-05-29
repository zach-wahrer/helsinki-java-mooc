/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class Book implements Comparable<Book> {
    private String name;
    private int minimumAge;
    
    public Book(String name, int minimumAge) {
        this.name = name;
        this.minimumAge = minimumAge;
    }
    
    public int getMinAge() {
        return this.minimumAge;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (recommended for " + this.minimumAge + " or older)";
    }
    
    @Override
    public int compareTo(Book book) {
        return this.minimumAge - book.getMinAge();
    }
}
