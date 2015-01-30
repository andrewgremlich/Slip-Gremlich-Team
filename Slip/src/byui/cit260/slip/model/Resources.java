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
public class Resources implements Serializable{
    
    private String resourceType;
    private int quantityInStock;
    private int requiredAmount;

    public Resources() {
    }
    
    

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public String toString() {
        return "Resources{" + "resourceType=" + resourceType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.resourceType);
        hash = 17 * hash + this.quantityInStock;
        hash = 17 * hash + this.requiredAmount;
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
        final Resources other = (Resources) obj;
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        return true;
    }
    
    
    
    
}
