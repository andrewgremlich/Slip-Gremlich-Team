/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.GameControl;
import byui.cit260.slip.control.InventoryControl;
import byui.cit260.slip.exceptions.InventoryControlException;
import byui.cit260.slip.model.InventoryItem;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import slip.Slip;

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
                + "\nH - Input Data for the Anti-Wolf Tool"
                + "\nI - Save Inventory to file"
                + "\n"
                + "\nR - Print Attack Strength of Iventory items"
                + "\nQ - Quit to Previous Menu"
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
            case 'r': //Quit program
                this.seeAttackReport();
                break;
            case 'i': //display inventory
                this.viewInventory();
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

    private void seeAttackReport() {
        //get the sorted list of inventory items for hte current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        this.console.println("\nAttack Strength list of Inventory Items");
        this.console.println("Item " + "\t"
                + "Attack Power" + "\t");

        //for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            //Display the description, the required amount and the amount in stock
            this.console.println(inventoryItem.getDescription() + "\t    "
                    + inventoryItem.getAttackPower());
        }
    }

    private void viewInventory() {

        try {
            
            Slip.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));

            Slip.outFile = new PrintWriter(System.out, true);
            //get the sorted list of inventory items for the current game
            

        } catch (Throwable e) {
            
            InventoryItem[] inventory = GameControl.getSortedInventoryList();
            
            this.console.println("\nList of Inventory Items");
            this.console.println("Description of " + "\t"
                    + "Required" + "\t"
                    + "In Stock");

            //for each inventory item
            for (InventoryItem inventoryItem : inventory) {
                //Display the description, the required amount and the amount in stock
                this.console.println(inventoryItem.getDescription() + "\t    "
                        + inventoryItem.getRequiredAmount() + "\t   "
                        + inventoryItem.getQuantityInStock());
            }
        }
    }

}
