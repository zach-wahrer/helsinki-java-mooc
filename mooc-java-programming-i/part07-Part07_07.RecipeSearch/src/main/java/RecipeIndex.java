/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeIndex {
    private ArrayList<Recipe> recipes;
    
    public RecipeIndex() {
        this.recipes = new ArrayList<>();
    }
    
    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void importRecipesFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            
            while(fileScanner.hasNextLine()) {
                Recipe recipe = new Recipe(fileScanner.nextLine());
                recipe.setCookingTime(Integer.valueOf(fileScanner.nextLine()));
                
                while(fileScanner.hasNextLine()) {
                    String row = fileScanner.nextLine();

                    if (row.equals("")) {
                        break;
                    }
                    recipe.addIngredient(row);
                }
            
                this.add(recipe);
            }
            
        } catch (Exception e) {
            System.out.println("Error reading file: " + e);
        }
    }
    
    @Override
    public String toString() {
        return this.toString(this.recipes);
    }
    
    public String toString(ArrayList<Recipe> recipes) {
        String formattedRecipes = "Recipes:\n";
        for (Recipe recipe : recipes) {
            formattedRecipes += recipe.toString() + "\n";
        }
        return formattedRecipes;
    }
    
    public ArrayList<Recipe> searchByName(String searchName) {
        ArrayList<Recipe> found = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(searchName)) {
                found.add(recipe);
            }
        }
        return found;
    }
    
    public ArrayList<Recipe> searchByTime(int time) {
        ArrayList<Recipe> found = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= time) {
                found.add(recipe);
            }
        }
        return found;
    }
    
    public ArrayList<Recipe> searchByIngredient(String ingredient) {
        ArrayList<Recipe> found = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                found.add(recipe);
            }
        }
        return found;
    }

}
