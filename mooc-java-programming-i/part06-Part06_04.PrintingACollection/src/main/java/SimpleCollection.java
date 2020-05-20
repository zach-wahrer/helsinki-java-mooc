
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    private String elementsToString() {
        String output = "";
        for (String element: this.elements) {
            output += element + "\n";
        }
        return output;
    }
    
    @Override
    public String toString() {
        String output = "The collection " + this.name + " ";
        
        int collectionSize = this.elements.size();
        if (collectionSize == 1) {
            output += "has 1 element:\n" + this.elements.get(0);
        } else if (collectionSize > 1) {
            output += "has " + collectionSize + " elements:\n";
            output += this.elementsToString();
        } else {
            output += "is empty.";
        }
        
        return output;
    }
    
}
