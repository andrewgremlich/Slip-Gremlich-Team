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
import java.util.logging.Level;
import java.util.logging.Logger;

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
        double circumference = 0;
        char choice = ((String) obj).toLowerCase().charAt(0);
        switch (choice) {
            case 'h': {
                try {
                    //Input for data wolf-tool
                    this.getCircumference();
                } catch (InventoryControlException ex) {
                    Logger.getLogger(InventoryMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            break;
            case 'q': //Quit program
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return true;
    }

    //Find the radius for the Anti-Wolf Tool
    private void getCircumference() throws InventoryControlException {
        boolean valid = false; //Indicates if the name has been retrived.
        //double inputSelection = 0;

        //prompt for the player's number
        this.console.println("Please enter the circumference");
        String input = this.getInput();
        double inputSelection = Double.parseDouble(input);

        // InventoryControl inv = new InventoryControl();  Another way to access method if I want to use 
        // double radius = inv.calcRadiusWolf(inputSelection);
        double radius = new InventoryControl("").calcRadiusWolf(inputSelection);

    }

}
