/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import byui.cit260.slip.control.MapControl;
import byui.cit260.slip.exceptions.MapControlException;
import byui.cit260.slip.model.Actor;
import byui.cit260.slip.model.InventoryItem;
import byui.cit260.slip.model.Backpack;
import byui.cit260.slip.model.Game;
import byui.cit260.slip.model.Map;
import byui.cit260.slip.model.Player;
import byui.cit260.slip.model.Scene;
import byui.cit260.slip.model.Sled;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlException {

        Game game = new Game();
        Slip.setCurrentGame(game);

        game.setPlayer(player);

        InventoryItem[] inventoryList = InventoryItem.createInventoryList();
        game.setInventory(inventoryList);

        Sled sled = new Sled();
        game.setSled(sled);

        Backpack backpack = new Backpack();
        game.setBackpack(backpack);

        Map map = new MapControl().createMap();
        game.setMap(map);

        MapControl.moveActorsToStartingLocation(map);

    }

    public static InventoryItem[] getSortedInventoryList() {

        //get inventory list for the current game
        InventoryItem[] originalInventoryList
                = Slip.getCurrentGame().getInventory();

        //clone make a copy of original list
        InventoryItem[] inventoryList = originalInventoryList.clone();

        //using a bubblesort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }

        return inventoryList;
    }
    private Iterable<String> Actor;

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("Called assignScenesToLocation");
    }

    public static Actor[] getSortedActorList() {

        //get actor list for the current game
        Actor[] originalActorList = Slip.getCurrentGame().getActor();

        //clone make a copy of original list
        Actor[] actorList = originalActorList.clone();

        //using a bubblesort to sort the list of actorList by name
        Actor tempActorList;
        for (int i = 0; i < actorList.length - 1; i++) {
            for (int j = 0; j < actorList.length - 1 - i; j++) {
                if (actorList[j].getDescription().
                        compareToIgnoreCase(actorList[j + 1].getDescription()) > 0) {
                    tempActorList = actorList[j];
                    actorList[j] = actorList[j + 1];
                    actorList[j + 1] = tempActorList;
                }

            }

        }
        return actorList;
    }

}
