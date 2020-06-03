/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dictionary;

/**
 *
 * @author zachtheclimber
 */
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Iterator;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String fileName;
    
    public SaveableDictionary(String fileName) {
        this.dictionary = new HashMap<>();
        this.fileName = fileName;
    }
    
    public SaveableDictionary() {
        this(null);
    }
    
    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.fileName))) {
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(":");
                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
        
        return true;
    }
    
    public boolean save() {
        this.removeReversePairs();
        try (PrintWriter saveFile = new PrintWriter(this.fileName)) {
            for (String word : this.dictionary.keySet()) {
                saveFile.println(word + ":" + this.translate(word));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
        
        return true;
    }
    
    public void add(String word, String translation) {
        if (!(this.dictionary.containsKey(word))) {
            this.dictionary.put(word, translation);
        }
        if (!(this.dictionary.containsKey(translation))) {
            this.dictionary.put(translation, word);
        }
    }
    
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    
    public void delete(String word) {
        String translation = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }
    
    public void removeReversePairs() {
        this.dictionary.keySet().removeIf(key -> this.dictionary.containsKey(this.dictionary.get(key)));
    }
     
}
