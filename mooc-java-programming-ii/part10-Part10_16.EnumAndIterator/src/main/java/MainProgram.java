import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        ArrayList<Person> employeeList = new ArrayList<>();
        employeeList.add(new Person("Test Guy", Education.PHD));
        employeeList.add(new Person("Mellow Guy", Education.BA));
        employeeList.add(new Person("Honest Girl", Education.PHD));
        employeeList.add(new Person("Smart Girl", Education.MA));
        Employees employees = new Employees();
        employees.add(employeeList);
        
        employees.fire(Education.BA);
        
        employees.print();
        
    }
}
