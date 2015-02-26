/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.util.Scanner;
import byui.cit260.slip.control.FactorControl;

/**
 *
 * @author Andrew
 */
public class AttackMenuView {
    
   
    
    private final String ATTACKMENU = "\n"
            +"\n-------------------------------"
            + "\n|        Attack Input         |"
            + "\n-------------------------------"
            + "\n";
  
    
    public void displayMenu() {
       boolean valid = false;
       
       while (!valid) {
           
           System.out.println(ATTACKMENU); // display main menu
           
           System.out.println("Enter tool power.");
           String input = this.getInput(); //get the user's selection
           double toolPower = Double.parseDouble(input);
           
           System.out.println("Enter health level.");
           input = this.getInput(); //get the user's selection
           double energyLevel = Double.parseDouble(input);          
           
           FactorControl factorControl = new FactorControl(energyLevel, toolPower);
           factorControl.calcAttackingPower(energyLevel, toolPower);
           
           //String attackDisplay = factorControl.calcAttackingPower(energyLevel, toolPower);
           //System.out.println(attackDisplay);
           
           break;
        } 
       
    }
    
    private String getInput() {
        boolean valid = false; //Indicates if the name has been retrived.
        String input = "";
        Scanner keyboard = new Scanner(System.in); //Keyboard input 
        
        while(!valid) { // while a valid input has not been retrived
        
            //prompt for the tool power
            System.out.println("Enter Value");
            
            //Get the number from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            
        if (input.length()<1){
            System.out.println("Invalid inputs.  Please try again.");
            continue;
        }
         break; //stops repetiotion
    }   
    return input;  // returns the players tool power selection.
    
    }
   
}
