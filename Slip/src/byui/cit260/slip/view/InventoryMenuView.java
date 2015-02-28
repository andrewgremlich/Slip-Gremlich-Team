/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.util.Scanner;
import byui.cit260.slip.control.InventoryControl;
import byui.cit260.slip.view.MainMenuView;

/**
 *
 * @author Richard
 */
public class InventoryMenuView {
    
 private final String WOLF = "\n"
            + "\n -------------------------------"
            + "\n ******* Inventory Menu ********"
            + "\n--------------------------------"
            + "\nh - Input Data for the Anti-Wolf Tool"
            + "\nq - Quit to Previous Menu";
            

    
       public void displayInventoryMenuView() {
       char selection = ' ';
       do {
           
           System.out.println(WOLF); // display Tool menu
           
           String  input = new MainMenuView().getInput().toLowerCase(); //The .toLowerCase() converts all input to lowercase
           //String input = this.getInput(); //get the user's selection
           
           selection = input.charAt(0); //get first character of string
           
           this.doAction(selection); //do action baseSd on selection
           
        } while (selection != 'q'); //an selection is not "Quit"
    }
      
       public void doAction (char choice) {
        switch (choice) {
            case 'h' : //Input for data wolf-tool
               //System.out.println("*****Test Circumference Input****");
                this.getCircumference();
                // this.getPlayersHair();s
                break;
            case 'q' : //Quit program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                break;
            }
    }    
    
    
    
 //Find the radius for the Anti-Wolf Tool
        private double getCircumference() {
        boolean valid = false; //Indicates if the name has been retrived.
        double inputSelection = 0;
        Scanner keyboard = new Scanner(System.in); //Keyboard input 
        
        while(!valid) { // while a valid number has not been retrived
        
            //prompt for the player's number
            System.out.println("Please enter the circumference");
            
            //Get the name from the keyboard and trim off the blanks
            inputSelection = keyboard.nextDouble();
            //inputSelection = inputSelection.trim(); Used for string
           
            //Check to make sure input is valid
            if (inputSelection > 0)
                break;
          
            else 
                System.out.println("Please enter a number greater than zero");                   
        }    
       
        //  break; //stops repetiotion
       // InventoryControl inv = new InventoryControl();  Another way to access method if I want to use 
       // double radius = inv.calcRadiusWolf(inputSelection);
        
        double radius = new InventoryControl().calcRadiusWolf(inputSelection);
         //Call Function to find radius
          //public double calcRadiusWolf(double circumference)          
    return radius; // returns the players menu selection.
    }
}    
    
    
    

