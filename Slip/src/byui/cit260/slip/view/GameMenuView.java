/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.FactorControl;
import byui.cit260.slip.control.GameControl;
import byui.cit260.slip.model.Actor;
import byui.cit260.slip.model.InventoryItem;
import byui.cit260.slip.model.Location;
import byui.cit260.slip.model.Map;
import slip.Slip;

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
                + "\nA - View Characters"
                + "\nS - Sled Status"
                + "\nQ - Resume Game"
                + "\n"
                + "\nY - Attack Menu"
                + "\n"
                + "\nH - Average health of ALL characters"
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
            case 'y'://view sled
                this.viewAttackMenu();
                break;
            case 'q': //return to main menu
                return true;
            case 'h'://view average health of all players.
                this.viewAverageHealth();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return false;
    }

    private void viewInventory() {
        //get the sorted list of inventory items for hte current game
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

    private void viewSledStatus() {
        this.console.println("Stub function called.");
    }

    private void viewActors() {
        Actor[] sortedActorList = GameControl.getSortedActorList();
        this.console.println(sortedActorList);
    }

    private Location[][] displayMap() {
        Map map = Slip.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        this.console.println("Slip Map of Mt. McKinley");
        this.console.println("\n  1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10"
                + "****************************************************");

        for (int i = 0; i < map.getNoOfRows(); i++) {
            this.console.println(i + " | ");
            this.console.println("\n  1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10");
            for (int j = 0; j < map.getNoOfColumns(); j++) {
                Location location = locations[i][j];
                String symbol = location.getScene().getMapSymbol();
                this.console.println(symbol + " | ");

            }
            this.console.println("\n*****************************************");
        }
        return locations;
    }

    private void viewAverageHealth() {
        this.console.println("The average health of all players is " + FactorControl.calculateAverageHealth());
    }

    private void viewAttackMenu() {
        AttackMenuView attackMenu = new AttackMenuView();
        attackMenu.display();
    }

}
