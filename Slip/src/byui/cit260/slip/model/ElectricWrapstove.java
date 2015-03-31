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
public class ElectricWrapstove extends Equipment {

    private double timeToCook;
    private double boilPoint;
    private int battery;

    public ElectricWrapstove() {
    }

    public double getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(double timeToCook) {
        this.timeToCook = timeToCook;
    }

    public double getBoilPoint() {
        return boilPoint;
    }

    public void setBoilPoint(double boilPoint) {
        this.boilPoint = boilPoint;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "ElectricWrapstove{" + "timeToCook=" + timeToCook + ", boilPoint=" + boilPoint + ", battery=" + battery + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.timeToCook) ^ (Double.doubleToLongBits(this.timeToCook) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.boilPoint) ^ (Double.doubleToLongBits(this.boilPoint) >>> 32));
        hash = 71 * hash + this.battery;
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
        final ElectricWrapstove other = (ElectricWrapstove) obj;
        if (Double.doubleToLongBits(this.timeToCook) != Double.doubleToLongBits(other.timeToCook)) {
            return false;
        }
        if (Double.doubleToLongBits(this.boilPoint) != Double.doubleToLongBits(other.boilPoint)) {
            return false;
        }
        if (this.battery != other.battery) {
            return false;
        }
        return true;
    }

}
