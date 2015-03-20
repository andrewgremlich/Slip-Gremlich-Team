/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.MapControl;
import byui.cit260.slip.model.Location;
import byui.cit260.slip.model.Map;
import byui.cit260.slip.model.Scene;

/**
 *
 * @author Andrew
 */
public class MapView extends View {

    public MapView(String promptMessage) {
        super("\n"
                + "\n-------------------------------"
                + "\n| Slip Map    |"
                + "\n-------------------------------"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Trying to Display the Map
    public Location[][] assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        System.out.println("Slip Map of Mt. McKinley");
        System.out.println("\n  1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10"
                + "****************************************************");
        for (int i = 0; i < locations.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < locations[i].length; j++) {
                Location location = locations[i][j];
                String symbol = MapControl.assignScenesToLocations(map, scenes);
                System.out.print(symbol + " | ");
            }
            System.out.println("\n*****************************************");
        }
        return locations;

    }

}
