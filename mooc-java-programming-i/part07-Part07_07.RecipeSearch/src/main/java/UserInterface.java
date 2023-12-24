
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xxx
 */
public class UserInterface {
    private Scanner scan;
    private ArrayList<Recipe> recipeList;
    private ArrayList<String> fileContents;
    
    public UserInterface(Scanner scan) {
        this.scan = scan;
        recipeList = new ArrayList<Recipe>();
        fileContents = new ArrayList<String>();
    }
    
    public void start() {
        System.out.println("File to read:");
        String file = scan.nextLine();
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (true) {
                System.out.println("Commands:");
                System.out.println("list - lists the recipes");
                System.out.println("stop - stops the program");
                System.out.println("find name - searches recipes by name");
                System.out.println("find cooking time - searches recipes by cooking time");
                System.out.println("find ingredient - searches recipes by ingredient");
                
                addFileContents(fileScan);
                makeRecipeObjects();
                    
                String command = scan.nextLine();
                
                if (command.equals("stop")) {
                    break;
                }
                
                if (command.equals("list")) {
                    printRecipeWithoutIngredients();
                }
                
                if (command.equals("find name")) {
                    System.out.println("Searched word: ");
                    String searched = scan.nextLine();
                    findRecipeByName(searched);
                }
                
                if (command.equals("find cooking time")) {
                    System.out.println("Searched word: ");
                    int searched = Integer.valueOf(scan.nextLine());
                    findRecipeByCookingTime(searched);
                }
                
                if (command.equals("find ingredient")) {
                    System.out.println("Searched word: ");
                    String searched = scan.nextLine();
                    findRecipeByIngredient(searched);
                }
            } 
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Unable to open file.");
        }
    }
    
    public void addFileContents(Scanner fileScan) {   
        while (fileScan.hasNextLine()) {
            String row = fileScan.nextLine();
            fileContents.add(row);
        }
    }
    
    public void makeRecipeObjects() {
        int i = 0;
        
        while (i < fileContents.size()) {
            if (fileContents.get(i).isEmpty()) {
                i++;
            } else {
                Recipe recipe = new Recipe();
                recipe.setName(fileContents.get(i));
                i++;
                recipe.setCookingTime(Integer.valueOf(fileContents.get(i)));
                i++;
                
                while(i < fileContents.size() && !(fileContents.get(i).isEmpty())) {
                    recipe.addIngredient(fileContents.get(i));
                    i++;
                }
                
                this.recipeList.add(recipe);
            }
        }
    }
    
    public void printRecipeWithoutIngredients() {
        System.out.println("Recipes");
        for (Recipe recipe: recipeList) {
            System.out.println(recipe.printRecipeWithoutIngredients());
        }
    }
    
    public void findRecipeByName(String searched) {
        for (Recipe recipe: recipeList) {
            if (recipe.getName().contains(searched)) {
                System.out.println(recipe.printRecipeWithoutIngredients());
            }
        }
    }
    
    public void findRecipeByCookingTime(int searched) {
        for (Recipe recipe: recipeList) {
            if (recipe.getCookingTime() <= searched) {
                System.out.println(recipe.printRecipeWithoutIngredients());
            }
        }
    }
    
    public void findRecipeByIngredient(String searched) {
        for (Recipe recipe: recipeList) {
            for (String ingredient: recipe.getIngredients()) {
                if (ingredient.equals(searched)) {
                    System.out.println(recipe.printRecipeWithoutIngredients());
                    continue;
                }
            }
        }
    }
}
