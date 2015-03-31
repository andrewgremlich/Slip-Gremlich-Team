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
public class AntiWolfTool extends Equipment {

    private double radius;
    private double frequency;
    private double battery;
    private boolean flare;

    public AntiWolfTool() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public boolean isFlare() {
        return flare;
    }

    public void setFlare(boolean flare) {
        this.flare = flare;
    }

    @Override
    public String toString() {
        return "AntiWolfTool{" + "radius=" + radius + ", frequency=" + frequency + ", battery=" + battery + ", flare=" + flare + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.frequency) ^ (Double.doubleToLongBits(this.frequency) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.battery) ^ (Double.doubleToLongBits(this.battery) >>> 32));
        hash = 97 * hash + (this.flare ? 1 : 0);
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
        final AntiWolfTool other = (AntiWolfTool) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (Double.doubleToLongBits(this.frequency) != Double.doubleToLongBits(other.frequency)) {
            return false;
        }
        if (Double.doubleToLongBits(this.battery) != Double.doubleToLongBits(other.battery)) {
            return false;
        }
        if (this.flare != other.flare) {
            return false;
        }
        return true;
    }

}
