/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.util.Scanner;
import byui.cit260.slip.control.InventoryControl;
import byui.cit260.slip.exceptions.InventoryControlException;
import static java.lang.Double.parseDouble;

/**
 *
 * @author Richard
 */
public class InventoryMenuView extends View {

    public InventoryMenuView() {
        super("\n"
                + "\n -------------------------------"
                + "\n ******* Inventory Menu ********"
                + "\n--------------------------------"
                + "\nh - Input Data for the Anti-Wolf Tool"
                + "\nq - Quit to Previous Menu"
                + "\n--------------------------------");

    }

    @Override
    public boolean doAction(Object obj) {
        char choice = ((String) obj).toLowerCase().charAt(0);
        switch (choice) {
            case 'h': {
                try {
                //Input for data wolf-tool
                    
                    double circumference = this.getCircumference();
                } catch (InventoryControlException ex) {
                    System.out.println("\nSorry. You must enter a number greater than Zero."
                            + "  Try again or enter Q to quit.");
                }
            }
            
            break;
            case 'q': //Quit program
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return true;
    }

    //Find the radius for the Anti-Wolf Tool
    private double getCircumference() throws InventoryControlException {
        boolean valid = false; //Indicates if the name has been retrived.
        double inputSelection = 0;

        try {
            
            while (!valid) { // while a valid number has not been retrived

            //prompt for the player's number
            System.out.println("Please enter the circumference");

            //Get the name from the keyboard and trim off the blanks
            inputSelection = this.keyboard.readLine(); //removed .nextDouble 
            //Go into doAction and use parseDouble to convert String to a double

            //Check to make sure input is valid
            if (inputSelection > 0) 
                break;
             else 
                System.out.println("Please enter a number greater than zero");
            
            }
        } catch (Exception e) {
                System.out.println("Error reading inout: " + e.getMessage());
        }
        // InventoryControl inv = new InventoryControl();  Another way to access method if I want to use 
        // double radius = inv.calcRadiusWolf(inputSelection);
        double radius = new InventoryControl().calcRadiusWolf(inputSelection);
                  
        return radius; // returns the players menu selection.
    }

}
