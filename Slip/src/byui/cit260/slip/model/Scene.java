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
public class Scene implements Serializable{
    
    public static Object SceneType;
    
    //Class instance variables
    private String MapSymbol;
    private String description;
    private double travelTime;
    private boolean blocked;
    private int steepTerrain;
    private int snowDepth;
    private String weather;
    private boolean exploredLocation;
    

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

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public boolean isExploredLocation() {
        return exploredLocation;
    }

    public void setExploredLocation(boolean exploredLocation) {
        this.exploredLocation = exploredLocation;
    } 
        

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + ", steepTerrain=" + steepTerrain + ", snowDepth=" + snowDepth + ", weather=" + weather + ", exploredLocation=" + exploredLocation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 37 * hash + (this.blocked ? 1 : 0);
        hash = 37 * hash + this.steepTerrain;
        hash = 37 * hash + this.snowDepth;
        hash = 37 * hash + Objects.hashCode(this.weather);
        hash = 37 * hash + (this.exploredLocation ? 1 : 0);
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
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        return this.exploredLocation == other.exploredLocation;
    }

    public void setMapSymbol(String _st_) {
        System.out.println("MAPSYMBOLLL");
    }
    
}
