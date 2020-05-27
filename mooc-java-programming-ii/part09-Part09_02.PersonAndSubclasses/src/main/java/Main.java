import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        Student zach = new Student("Zach Wahrer", "A Street, Bozeman, MT 59715");
        System.out.println(zach);
        zach.study();
        zach.study();
        System.out.println(zach);
        
        Teacher twoie = new Teacher("Twoie Wahrer", "B Street, Bozeman, MT 59715", 10000);
        System.out.println(twoie);
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(zach);
        people.add(twoie);
        
        printPersons(people);
        
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
