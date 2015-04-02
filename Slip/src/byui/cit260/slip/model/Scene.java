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
public class Scene implements Serializable {

    public static Object SceneType;

    //Class instance variables
    private String MapSymbol;
    private String description;
    private double travelTime;
    private boolean blocked;
    private int steepTerrain;
    private int snowDepth;
    private int depression;
    private int hunger;
    private int energy;
    private int airPressure;

    public Scene() {
    }

    public static Object getSceneType() {
        return SceneType;
    }

    public static void setSceneType(Object SceneType) {
        Scene.SceneType = SceneType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return MapSymbol;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public int getSteepTerrain() {
        return steepTerrain;
    }

    public void setSteepTerrain(int steepTerrain) {
        this.steepTerrain = steepTerrain;
    }

    public int getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(int snowDepth) {
        this.snowDepth = snowDepth;
    }

    public void setMapSymbol(String MapSymbol) {
        this.MapSymbol = MapSymbol;
    }

    public int getDepression() {
        return depression;
    }

    public void setDepression(int depression) {
        this.depression = depression;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(int airPressure) {
        this.airPressure = airPressure;
    }

    @Override
    public String toString() {
        return "Scene{" + "MapSymbol=" + MapSymbol + ", description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + ", steepTerrain=" + steepTerrain + ", snowDepth=" + snowDepth + ", depression=" + depression + ", hunger=" + hunger + ", energy=" + energy + ", airPressure=" + airPressure + '}';
    }   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.MapSymbol);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 67 * hash + (this.blocked ? 1 : 0);
        hash = 67 * hash + this.steepTerrain;
        hash = 67 * hash + this.snowDepth;
        hash = 67 * hash + this.depression;
        hash = 67 * hash + this.hunger;
        hash = 67 * hash + this.energy;
        hash = 67 * hash + this.airPressure;
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.MapSymbol, other.MapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.steepTerrain != other.steepTerrain) {
            return false;
        }
        if (this.snowDepth != other.snowDepth) {
            return false;
        }
        if (this.depression != other.depression) {
            return false;
        }
        if (this.hunger != other.hunger) {
            return false;
        }
        if (this.energy != other.energy) {
            return false;
        }
        if (this.airPressure != other.airPressure) {
            return false;
        }
        return true;
    }
    
    


}
