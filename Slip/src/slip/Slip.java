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
import byui.cit260.slip.view.StartProgramView;

/**
 *
 * @author Richard
 */
public class Slip {

    private static Game currentgame = null;
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //AttackMenuView attackMenuView = new AttackMenuView();
        //attackMenuView.display();
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();

        Resources resourcesOne = new Resources();

        resourcesOne.setRequiredAmount(6);
        resourcesOne.setQuantityInStock(10);
        resourcesOne.setResourceType("Food");

        String resourcesInfo = resourcesOne.toString();
        System.out.println(resourcesInfo);

        ElectricWrapstove electricWrapStoveOne = new ElectricWrapstove();

        electricWrapStoveOne.setBattery(5);
        electricWrapStoveOne.setBoilPoint(100.98);
        electricWrapStoveOne.setTimeToCook(23.34);

        String electricWrapStoveInfo = electricWrapStoveOne.toString();
        System.out.println(electricWrapStoveInfo);

        AntiWolfTool antiWolfToolOne = new AntiWolfTool();

        antiWolfToolOne.setFlare(true);
        antiWolfToolOne.setBattery(45.33);
        antiWolfToolOne.setFrequency(55.677);
        antiWolfToolOne.setRadius(33.44);

        String antiWolfToolInfo = antiWolfToolOne.toString();
        System.out.println(antiWolfToolInfo);

        Barometer barometerOne = new Barometer();

        barometerOne.setAirPressure(89.59);

        String barometerInfo = barometerOne.toString();
        System.out.println(barometerInfo);

        Equipment equipmentOne = new Equipment();

        equipmentOne.setEquipmentType("The equipment is good!");
        equipmentOne.setQuantityInStock(9);
        equipmentOne.setStatusOfEquipment(true);

        String equipmentInfo = equipmentOne.toString();
        System.out.println(equipmentOne);

        Backpack backpackOne = new Backpack();

        backpackOne.setContains(true);
        backpackOne.setBackpackStatus(true);
        backpackOne.setMaxCapacity(10);

        String backpackInfo = backpackOne.toString();
        System.out.println(backpackInfo);

        Sled sledOne = new Sled();

        sledOne.setDescription("High quality and durable sled to withstand all terrains.");
        sledOne.setLength(4);
        sledOne.setMaxCapacity(20);
        sledOne.setWidth(9);

        String sledInfo = sledOne.toString();
        System.out.println(sledInfo);

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

    public static Game getCurrentgame() {
        return currentgame;
    }

    public static void setCurrentgame(Game currentgame) {
        Slip.currentgame = currentgame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Slip.player = player;
    }

}
