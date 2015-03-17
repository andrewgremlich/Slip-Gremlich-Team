/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Richard
 */
public enum Actor implements Serializable {

    //Enum List of Actors
    Bill("He is the leader of the expedition."),
    John("The wealthy and stuck up expedition member."),
    Sarah("The sweet girl that breaks her leg."),
    Samantha("Sarah's best friend. She is crazy."),
    Travis("The big clown of the group, heart bigger than his head"),
    Wil("Big lovly bear of a fella, your close associate."),
    SantaClaus("Yes. That Sanata Claus. Fat joyful individual."),
    BuddytheElf("Santa's prideful servant."),
    AbominableSnowman("Constantly hungry and dangerous."),
    Felecious("The big bad wolf that is always on the prowl");

    public static Actor getBill() {
        return Bill;
    }

    public static Actor getJohn() {
        return John;
    }

    public static Actor getSarah() {
        return Sarah;
    }

    public static Actor getSamantha() {
        return Samantha;
    }

    public static Actor getTravis() {
        return Travis;
    }

    public static Actor getWil() {
        return Wil;
    }

    public static Actor getSantaClaus() {
        return SantaClaus;
    }

    public static Actor getBuddytheElf() {
        return BuddytheElf;
    }

    public static Actor getAbominableSnowman() {
        return AbominableSnowman;
    }

    public static Actor getFelecious() {
        return Felecious;
    }
    

    //Class instance variables
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
