
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Country> countries = convertFileToCountries("literacy.csv");
        Collections.sort(countries);
        printCountries(countries);
        
    }
    
    public static ArrayList<Country> convertFileToCountries(String fileName) {
        ArrayList<Country> countries = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(fileName))
                .map(row -> row.split(","))
                .filter(segments -> segments.length == 6)
                .map(parts -> new Country(parts[3], removePercent(parts[2]), Double.valueOf(parts[5]), Integer.valueOf(parts[4])))
                .forEach(country -> countries.add(country));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return countries;
    }
    
    public static void printCountries(ArrayList<Country> countries) {
        for (Country country : countries) {
            System.out.println(country);
        }
    }
    
    public static String removePercent(String input) {
        if (input.contains("female")) {
            return "female";
        } else {
            return "male";
        }
        
    }
}
