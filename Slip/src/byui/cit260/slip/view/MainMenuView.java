/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.GameControl;
import java.util.Scanner;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public class MainMenuView {

    private final String MENU = "\n"
            +"\n-------------------------------"
            + "\n|        Main Menu            |"
            + "\n-------------------------------"
            + "\nS - Start Game"
            + "\nL - Load Game"
            + "\nI - Instructions"
            + "\nP - Player Menu"
            + "\n|                             |"
            + "\nQ - Quit Program";         
         
  
    
    public void displayMenu() {
       char selection = ' ';
       do {
           
           System.out.println(MENU); // display main menu
           
           String input = this.getInput(); //get the user's selection
           selection = input.charAt(0); //get first character of string
           
           this.doAction(selection); //do action based on selection
           
        } while (selection != 'Q'); //an selection is not "Quit"
    }
    
    public void doAction (char choice) {
        switch (choice) {
            case 'S' : //Start a new game
                this.startNewGame();
                break;
            case 'L' : //load game
                this.loadGame();
                break;
            case 'I' : //Instructions
                this.displayMenu();
                break;
            case 'P' : // Player Menu
                this.seePlayerMenu();
                break;
            case 'Q' : //Quit program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                break;
            }
    }
    
    private String doAction() {
        boolean valid = false; //Indicates if the name has been retrived.
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input 
        
        while(!valid) { // while a valid name has not been retrived
        
            //prompt for the player's name
            System.out.println("Please enter your name below:");
            
            //Get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //If the name is invalid (less than two characters in length)
         if (playersName.length() < 2) {
             System.out.println("Invalid name - the name must not be shorter than two characters");
             continue; //and rpeat again
         }
         break; //stops repetiotion
         
    }   
    return playersName; // returns the players name.
    }
    
    

    private void startNewGame() {
        //Create new game
        GameControl.createNewGame(Slip.getPlayer()); 
        
        //display the game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void loadGame() {
        System.out.println("*** startExistingGame function called ***"); 
    }

    private void seeInstructions() {
        System.out.println("*** seeInstructions function called ***");
    }

    private void seePlayerMenu() {
        System.out.println("*** seePlayerMenu function called ***");
    }

    private String getInput() {
        System.out.println("*** seePlayerMenu input ***");
    }
    
}
