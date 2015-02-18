/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.ProgramControl;
import byui.cit260.slip.model.Player;
import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class StartProgramView {

    public StartProgramView() {
    }
 
    public void startProgram() {
    /*  startProgram(): void
BEGIN
 Display the banner screen
 Get the players name
 Create a new player
 DISPLAY a customized welcome message
 DISPLAY the main menu
END */
   
    this.displayBanner();
    
    //prompt the player to enter their name
    String playersName = this.getPlayersName();
    
    //Create and save the player object
    Player player = ProgramControl.createPlayer(playersName);
    
    } 

    private void displayBanner() {
        System.out.println("\n\n*************************************************************************"
                 + "\n Welcome to Slip");
                        
        System.out.println(""
                + "\n In this text based role playing game, "
                + "\n you will be put into a futuristic extreme "
                + "\n camping experience. You will be hiking on Mt. McKinley in Alaska."
                + "\n The goal is to hike to the summit of the mountain. "
                + "\n You will need to battle the environemnt and depression as you summit the mountain.");
        
        System.out.println("\n***************************************************************************");        
        }

    private String getPlayersName() {
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
    
            
}
