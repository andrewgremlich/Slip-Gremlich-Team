/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.model;

/**
 *
 * @author Andrew
 */
public class InventoryItem {
    
    private String description;
    private int quantityInStock;
    private int requiredAmount;

    public InventoryItem() {
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

    public static InventoryItem[] createInventoryList() {

        InventoryItem[] inventory = 
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];

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

        return inventory;
    }

    private void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    private void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    public int getQuantityInStock() {
        return quantityInStock;
    }

    private void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    } 

}
