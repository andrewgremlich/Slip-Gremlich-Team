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
import byui.cit260.slip.model.Player;
import byui.cit260.slip.model.Resources;
import byui.cit260.slip.model.Sled;

/**
 *
 * @author Richard
 */
public class Slip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
    }
    
}
