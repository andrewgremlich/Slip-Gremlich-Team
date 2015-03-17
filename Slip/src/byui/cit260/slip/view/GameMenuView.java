/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.GameControl;
import byui.cit260.slip.model.Actor;
import byui.cit260.slip.model.InventoryItem;

/**
 *
 * @author Richard
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n -------------------------------"
                + "\n ***** Game Menu ********"
                + "\n--------------------------------"
                + "\nM - Display Map"
                + "\nI - View Inventory"
                + "\nA - View Actors"
                + "\nS - Sled Status"
                + "\nQ - Resume Game"
                + "\n--------------------------------");
    }

    public GameMenuView(String promptMessage) {
        super(promptMessage);
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = ((String) obj).toLowerCase().charAt(0);
        switch (selection) {
            case 'm': //display map
                this.displayMap();
                break;
            case 'i': //display inventory
                this.viewInventory();
                break;
            case 'a'://view actors
                this.viewActors();
                break;
            case 's'://view sled
                this.viewSledStatus();
                break;
            case 'q': //return to main menu
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return false;
    }

    private void viewInventory() {
        //get the sorted list of inventory items for hte current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description of " + "\t" +
                            "Required" + "\t" +
                            "In Stock");
        
        //for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            //Display the description, the required amount and the amount in stock
            System.out.println(inventoryItem.getDescription() + "\t    " +
                                inventoryItem.getRequiredAmount() + "\t   "+
                                inventoryItem.getQuantityInStock());
        }
    }
    
    private void viewSledStatus() {
        System.out.println("Stub function called.");
    }

    private void viewActors() {
        Actor[] sortedActorList = GameControl.getSortedActorList();
        System.out.println(sortedActorList);
    }

    private void displayMap() {
        System.out.println("display map stubfunction");
    }

}
