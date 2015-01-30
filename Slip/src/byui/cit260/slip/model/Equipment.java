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
 * @author Andrew
 */
public class Equipment implements Serializable{
    
    private String equipmentType;
    private int quantityInStock;
    private boolean statusOfEquipment;

    public Equipment() {
    }
    
    

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public boolean isStatusOfEquipment() {
        return statusOfEquipment;
    }

    public void setStatusOfEquipment(boolean statusOfEquipment) {
        this.statusOfEquipment = statusOfEquipment;
    }

    @Override
    public String toString() {
        return "Equipment{" + "equipmentType=" + equipmentType + ", quantityInStock=" + quantityInStock + ", statusOfEquipment=" + statusOfEquipment + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.equipmentType);
        hash = 79 * hash + this.quantityInStock;
        hash = 79 * hash + (this.statusOfEquipment ? 1 : 0);
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
        final Equipment other = (Equipment) obj;
        if (!Objects.equals(this.equipmentType, other.equipmentType)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.statusOfEquipment != other.statusOfEquipment) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
