/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.model;

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
    Santa_Claus("Yes. That Sanata Claus. Fat joyful individual."),
    Buddy_the_Elf("Santa's prideful servant."),
    Abominable_Snowman("Constantly hungry and dangerous."),
    Felecious("The big bad wolf that is always on the prowl");

    //Class instance variables
    private final String description;

    private final Point coordinates;

    public Point getCoordinates() {
        return coordinates;
    }

    public Point setCoordinates() {
        this.coordinates = coordinates;
    }

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1, 1);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

}
