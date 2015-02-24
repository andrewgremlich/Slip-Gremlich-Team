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
           
        } while (selection != 'q'); //an selection is not "Quit"
    }
      
       public void doAction (char choice) {
        switch (choice) {
            case 'h' : //Hair Color Input
               System.out.println("*****Test Hair Color Input****");
                // this.getPlayersHair();
                break;
            case 'e' : //Eye Color Input
                System.out.println("*****Test Eye Color Input****");
                break;
            case 'g' : //Gender Input
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
 /*  private String getPlayersHair() {
        boolean valid = false; //Indicates if the name has been retrived.
        String playersHair = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input 
        
        while(!valid) { // while a valid name has not been retrived
        
            //prompt for the player's name
            System.out.println("Please enter your hair color below:");
            
            //Get the name from the keyboard and trim off the blanks
            playersHair = keyboard.nextLine();
            playersHair = playersHair.trim();
            
            //If they are bald 
         if (playersHair == 'none') {
             System.out.println("You might get very cold");
             continue; //and repeat again
         }
         break; //stops repetiotion
         
    }   
    return playersHair; // returns the players name.
    }
  */  
    
}
