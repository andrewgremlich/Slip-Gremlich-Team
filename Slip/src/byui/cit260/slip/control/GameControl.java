/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import byui.cit260.slip.model.Backpack;
import byui.cit260.slip.model.Game;
import byui.cit260.slip.model.Map;
import byui.cit260.slip.model.Player;
import byui.cit260.slip.model.Resources;
import byui.cit260.slip.model.Scene;
import byui.cit260.slip.model.Sled;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public class GameControl {

    public static void createNewGame(Player player) {

        Game game = new Game();
        Slip.setCurrentGame(game);

        game.setPlayer(player);

        Resources[] resourcesList = GameControl.createResourcesList();
        game.setResources(resourcesList);

        Sled sled = new Sled();
        game.setSled(sled);

        Backpack backpack = new Backpack();
        game.setBackpack(backpack);

        Map map = new MapControl.createMap();
        game.setMap(map);

        MapControl.moveActorsToStartingLocation(map);

    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("Called assignScenesToLocation");
    }

}
