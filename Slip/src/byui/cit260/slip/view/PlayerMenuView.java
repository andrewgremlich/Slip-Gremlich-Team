/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class PlayerMenuView {
    
    private final String PLAYER = "\n"
            + "\n -------------------------------"
            + "\n ******* Player Menu ********"
            + "\n--------------------------------"
            + "\nH - Input Hair Color"
            + "\nE - Input Eye Color"
            + "\nG - Input Gender"
            + "\nQ - Quit the Player Menu";

    
       public void displayPlayerMenu() {
       char selection = ' ';
       do {
           
           System.out.println(PLAYER); // display player menu
           
           String input = this.getInput(); //get the user's selection
           selection = input.charAt(0); //get first character of string
           
           this.doAction(selection); //do action based on selection
           
        } while (selection != 'Q'); //an selection is not "Quit"
    }
      
       public void doAction (char choice) {
        switch (choice) {
            case 'h' : //How to move
                System.out.println("*****Test Hair Color Input****");
                break;
            case 'e' : //Resources info
                System.out.println("*****Test Eye Color Input****");
                break;
            case 'g' : //Instructions
                System.out.println("*****Test Gender Input****");
                break;
            case 'q' : //Quit program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                break;
            }
    }

private String getInput() {
        boolean valid = false; //Indicates if the name has been retrived.
        String inputSelection = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input 
        
        while(!valid) { // while a valid name has not been retrived
        
            //prompt for the player's name
            System.out.println("Please make a menu selection:");
            
            //Get the name from the keyboard and trim off the blanks
            inputSelection = keyboard.nextLine();
            inputSelection = inputSelection.trim();
            

         
         break; //stops repetition
         
    }   
    return inputSelection; // returns the players menu selection.
    }  

    
    
}
