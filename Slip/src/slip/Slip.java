/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slip;

import byui.cit260.slip.model.AntiWolfTool;
import byui.cit260.slip.model.Backpack;
import byui.cit260.slip.model.Barometer;
import byui.cit260.slip.model.ElectricWrapstove;
import byui.cit260.slip.model.Equipment;
import byui.cit260.slip.model.Actor;
import byui.cit260.slip.model.Factors;
import byui.cit260.slip.model.Game;
import byui.cit260.slip.model.Location;
import byui.cit260.slip.model.Map;
import byui.cit260.slip.model.Player;
import byui.cit260.slip.model.Resources;
import byui.cit260.slip.model.Sled;
import byui.cit260.slip.model.Scene;
import byui.cit260.slip.view.AttackMenuView;
import byui.cit260.slip.view.HealthView;
import byui.cit260.slip.view.StartProgramView;

/**
 *
 * @author Richard
 */
public class Slip {

    private static Game currentgame = new Game();
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        try{
        startProgramView.display();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }

    }

    public static Object getCurrentgame() {
        return currentgame;
    }

    public static void setCurrentgame(Game game) {
        Slip.currentgame = currentgame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Slip.player = player;
    }

    public static void setCurrentGame(Game game) {
        System.out.println("Stubfunction called");
    }

    public static Game getCurrentGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
