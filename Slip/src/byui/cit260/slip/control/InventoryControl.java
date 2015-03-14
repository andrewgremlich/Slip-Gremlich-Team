/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import java.io.IOException;

/**
 *
 * @author Andrew
 */
public class InventoryControl {

    public double calcBoilingPoint(int airPressure, int temperature) {

        //the time variable is a static constant for the equation
        int TIME = 20;

        //check if the airPressure is inbetween 1-50
        if (airPressure < 1 || 50 < airPressure) {
            return -1;
        }

        //check if the temperature is between -20 and 20
        if (temperature < -20 || 20 < temperature) {
            return -1;
        }

            //this is a hand-made equation to find boiling point and if it is a number
        if (temperature % 1 == 0 && airPressure % 1 == 0) {
            double boil = Math.abs((temperature * TIME) / airPressure);
            return boil;
        } else {
            return -1;
        }
    }

    public double calcRadiusWolf(double circumference) {

        //Check to see if circumerfernce input is greater than zero.	
        if (circumference > 0) {

            double radius = Math.round(circumference / (2 * Math.PI) * 100.0) / 100.0;
            System.out.println("You will be protected from the wolves within the radius of " + radius + " feet");

            return radius; //return to view layer InventoryMenuView

        } else {
            return -1;
        }
    }

    public static InventoryItem[] createInventoryItemList() {
        
        InventoryItem[] inventory
                = new InventoryItem[16];

        InventoryItem wood = new InventoryItem();
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmount(0);
        inventory[Item.wood.ordinal()] = wood;
        
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem energyBar = new InventoryItem();
        energyBar.setDescription("Energy Bar");
        energyBar.setQuantityInStock(0);
        energyBar.setRequiredAmount(0);
        inventory[Item.energyBar.ordinal()] = energyBar;
        
        InventoryItem battery = new InventoryItem();
        battery.setDescription("Battery");
        battery.setQuantityInStock(0);
        battery.setRequiredAmount(0);
        inventory[Item.battery.ordinal()] = battery;
        
        InventoryItem icePick = new InventoryItem();
        icePick.setDescription("Ice Pick");
        icePick.setQuantityInStock(0);
        icePick.setRequiredAmount(0);
        inventory[Item.icePick.ordinal()] = icePick;
        
        InventoryItem goretexCoat = new InventoryItem();
        goretexCoat.setDescription("Gore-tex Coat");
        goretexCoat.setQuantityInStock(0);
        goretexCoat.setRequiredAmount(0);
        inventory[Item.goretexCoat.ordinal()] = goretexCoat;
        
        InventoryItem crampons = new InventoryItem();
        crampons.setDescription("Crampons");
        crampons.setQuantityInStock(0);
        crampons.setRequiredAmount(0);
        inventory[Item.crampons.ordinal()] = crampons;
        
        InventoryItem gloves = new InventoryItem();
        gloves.setDescription("Gloves");
        gloves.setQuantityInStock(0);
        gloves.setRequiredAmount(0);
        inventory[Item.gloves.ordinal()] = gloves;
        
        InventoryItem snowGoggles = new InventoryItem();
        snowGoggles.setDescription("Snow Goggles");
        snowGoggles.setQuantityInStock(0);
        snowGoggles.setRequiredAmount(0);
        inventory[Item.snowGoggles.ordinal()] = snowGoggles;
        
        InventoryItem iceAxe = new InventoryItem();
        iceAxe.setDescription("Ice Axe");
        iceAxe.setQuantityInStock(0);
        iceAxe.setRequiredAmount(0);
        inventory[Item.iceAxe.ordinal()] = iceAxe;
        
                
        InventoryItem iceScrews = new InventoryItem();
        iceScrews.setDescription("Ice Screws");
        iceScrews.setQuantityInStock(0);
        iceScrews.setRequiredAmount(0);
        inventory[Item.iceScrews.ordinal()] = iceScrews;
                
        InventoryItem snowDeadman = new InventoryItem();
        snowDeadman.setDescription("Snow Deadman");
        snowDeadman.setQuantityInStock(0);
        snowDeadman.setRequiredAmount(0);
        inventory[Item.snowDeadman.ordinal()] = snowDeadman;
        
        InventoryItem boots = new InventoryItem();
        boots.setDescription("Boots");
        boots.setQuantityInStock(0);
        boots.setRequiredAmount(0);
        inventory[Item.boots.ordinal()] = boots;
        
        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[Item.rope.ordinal()] = rope;
        
        InventoryItem ascender = new InventoryItem();
        ascender.setDescription("Ascender");
        ascender.setQuantityInStock(0);
        ascender.setRequiredAmount(0);
        inventory[Item.ascender.ordinal()] = ascender;
        
        InventoryItem mre = new InventoryItem();
        mre.setDescription("MRE");
        mre.setQuantityInStock(0);
        mre.setRequiredAmount(0);
        inventory[Item.mre.ordinal()] = mre;
        
        InventoryItem flares = new InventoryItem();
        flares.setDescription("Flares");
        flares.setQuantityInStock(0);
        flares.setRequiredAmount(0);
        inventory[Item.flares.ordinal()] = flares;
    }

    public enum Item {

        wood,
        water,
        energyBar,
        battery,
        icePick,
        goretexCoat,
        crampons,
        gloves,
        snowGoggles,
        iceAxe,
        iceScrews,
        snowDeadman,
        boots,
        rope,
        ascender,
        mre,
        flares;

    }

}
