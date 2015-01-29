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
public class Factors implements Serializable {
    
    //Class Instance Variables
    private String energyType;
    private double energyLevel;

    public Factors() {
    }

    @Override
    public String toString() {
        return "Factors{" + "energyType=" + energyType + ", energyLevel=" + energyLevel + '}';
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public double getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.energyType);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.energyLevel) ^ (Double.doubleToLongBits(this.energyLevel) >>> 32));
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
        final Factors other = (Factors) obj;
        if (!Objects.equals(this.energyType, other.energyType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.energyLevel) != Double.doubleToLongBits(other.energyLevel)) {
            return false;
        }
        return true;
    }

    

    
    
    
    
}
