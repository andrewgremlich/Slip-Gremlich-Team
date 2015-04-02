/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Andrew
 */
public enum Actor implements Serializable{
    
     //Enum List of Actors
    Phil("You take control of this character", 10),
    Bill("He is the leader of the expedition.", 8),
    John("The wealthy and stuck up expedition member.", 7),
    Sarah("The sweet girl that breaks her leg.", 5),
    Samantha("Sarah's best friend. She is crazy.", 5),
    Travis("The big clown of the group, heart bigger than his head", 7),
    Wil("Big lovly bear of a fella, your close associate.", 7),
    SantaClaus("Yes. That's Santa Claus--Fat joyful individual.", 10),
    BuddyTheElf("Santa's prideful servant.", 5),
    AbominableSnowman("Constantly hungry and dangerous.", 10),
    Felecious("The big bad wolf that is always on the prowl", 10);

    //Class instance variables
    private final String description;
    private final Point coordinates;
    private final int health;

    Actor(String description, int health) {
        this.description = description;
        coordinates = new Point(1, 1);
        this.health = health;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public int getHealth() {
        return health;
    }
    
}
