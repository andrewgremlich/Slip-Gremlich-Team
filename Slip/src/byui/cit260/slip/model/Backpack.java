/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.model;


import java.io.Serializable;
/**
 *
 * @author Andrew
 */
public class Backpack implements Serializable{
    
    private boolean contains;
    private boolean backpackStatus;
    private int maxCapacity;

    public Backpack() {
        this.contains = false;
        this.backpackStatus = false;
        this.maxCapacity = 0;
    }

    public boolean isContains() {
        return contains;
    }

    public void setContains(boolean contains) {
        this.contains = contains;
    }

    public boolean isBackpackStatus() {
        return backpackStatus;
    }

    public void setBackpackStatus(boolean backpackStatus) {
        this.backpackStatus = backpackStatus;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Backpack{" + "contains=" + contains + ", backpackStatus=" + backpackStatus + ", maxCapacity=" + maxCapacity + '}';
    }
/*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.contains ? 1 : 0);
        hash = 67 * hash + (this.backpackStatus ? 1 : 0);
        hash = 67 * hash + this.maxCapacity;
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
        final Backpack other = (Backpack) obj;
        if (this.contains != other.contains) {
            return false;
        }
        if (this.backpackStatus != other.backpackStatus) {
            return false;
        }
        if (this.maxCapacity != other.maxCapacity) {
            return false;
        }
        return true;
    }
   
*/

    
    
    
    
}
