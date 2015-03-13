/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.model;

import byui.cit260.slip.control.GameControl;
import java.io.Serializable;

/**
 *
 * @author Richard
 */
public class Map implements Serializable{

    private static Scene[] createScenes() {
        System.out.println("CALLEDDDD createScenes");
        return null;
    }
    
    //Class instance variables
    private int rowCount;
    private int columnCount;
    private Location[][] locations;
    private int noOfRows;
    private int noOfColumns;

    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero.");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //creat 2-D  array for location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++){
                //create and intiialize location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the location object to the current position in the array.
                locations [row][column] = location;
            }
            
        }
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }
    
    private static Map createMap(){
        //create map
        Map map = new Map(10, 10);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scene to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    
}
