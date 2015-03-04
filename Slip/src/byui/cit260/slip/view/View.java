/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public abstract class View implements ViewInterface{ //View SuperClass!!!
    
    private String promptMessage;
    
    public View (String promptMessage) {//Contructor Function!!!!
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
    @Override
    public void display() {
       String value;
       do {
           
           System.out.println(this.promptMessage); // display main menu
           
           value = this.getInput(); //get the user's selection
           //selection = input.charAt(0); //get first character of string
           
           this.doAction(value); //do action based on selection
           
        } while (!value.equals("Q")); //an selection is not "Quit"
    }
    
    @Override
    public String getInput() {
        boolean valid = false; //Indicates if the name has been retrived.
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input 
        
        while(!valid) { // while a valid name has not been retrived
        
            //prompt for the player's name
            System.out.println("Please make a menu selection:");
            
            //Get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n**** Invalide Selection.  Please try again...");
                continue;
            }        
         break; //stops repetiotion
         
    }   
    return selection; // returns the players menu selection.
    }
    
    
    
}
