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
public class Barometer extends Equipment{
    
    private double airPressure;

    public Barometer() {
    }
    
    

    public double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(double airPressure) {
        this.airPressure = airPressure;
    }

    @Override
    public String toString() {
        return "Barometer{" + "airPressure=" + airPressure + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.airPressure) ^ (Double.doubleToLongBits(this.airPressure) >>> 32));
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
        final Barometer other = (Barometer) obj;
        if (Double.doubleToLongBits(this.airPressure) != Double.doubleToLongBits(other.airPressure)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
