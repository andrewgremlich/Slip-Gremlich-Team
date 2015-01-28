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
public class Player implements Serializable {
    
    //Class instance variables
    //test
    private String name; 
    private double bestTime;
    private double attackingPower;


    public Player() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public double getAttackingPower() {
        return attackingPower;
    }

    public void setAttackingPower(double attackingPower) {
        this.attackingPower = attackingPower;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + ", attackingPower=" + attackingPower + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.attackingPower) ^ (Double.doubleToLongBits(this.attackingPower) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attackingPower) != Double.doubleToLongBits(other.attackingPower)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
