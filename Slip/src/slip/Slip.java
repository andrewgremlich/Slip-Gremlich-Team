/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slip;

import byui.cit260.slip.model.Actor;
import byui.cit260.slip.model.Factors;
import byui.cit260.slip.model.Game;
import byui.cit260.slip.model.Location;
import byui.cit260.slip.model.Map;
import byui.cit260.slip.model.Player;
import byui.cit260.slip.model.Scene;

/**
 *
 * @author Richard
 */
public class Slip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Test Player class
        Player playerOne = new Player();
        
        playerOne.setName("Andrew Richard");
        playerOne.setBestTime(7.00);
        playerOne.setAttackingPower(10.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
      
        //Test Factors class
        Factors andrew = new Factors();
        
        andrew.setEnergyType("depresion");
        andrew.setEnergyLevel(5);
        
        String andrewInfo = andrew.toString();
        System.out.println(andrewInfo);
        
        
        
        //Test Game class
        Game richard = new Game();
        
        richard.setTime(10.05);
        richard.setWinner("Congratulations..You are have lost");
        
        String richardInfo = richard.toString();
        System.out.println(richardInfo);
        
        
        //Test Actor class
        Actor travis = new Actor();
        
        travis.setName("Travis");
        travis.setDescription("Crazy Young Man");
        
        String travisInfo = travis.toString();
        System.out.println(travisInfo);
        
        //Test Map
        Map idaho = new Map();
        
        idaho.setRowCount(5);
        idaho.setColumnCount(3);
        
        String idahoInfo = idaho.toString();
        System.out.println(idahoInfo);
        
        //Test Location
        Location nevada = new Location();
        
        nevada.setRow(6);
        nevada.setColumn(8);
        nevada.setVisited(true);
        
        String nevadaInfo = nevada.toString();
        System.out.println(nevadaInfo);
        
        //Test Scene
        Scene grassLand = new Scene();
        
        grassLand.setDescription("You are standing in a beautiful field of clover");
        grassLand.setTravelTime(14.5);
        grassLand.setBlocked(false);
        grassLand.setSteepTerrain(5);
        grassLand.setSnowDepth(7);
        grassLand.setWeather("It is very snowy at the moment");
        grassLand.setExploredLocation(false);
        
        String grassLandInfo = grassLand.toString();
        System.out.println(grassLandInfo);
        
        
        
        
        
        
                
        
        
        
        
    }
    
}
