/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import byui.cit260.slip.model.Game;
import byui.cit260.slip.model.Location;
import byui.cit260.slip.model.Map;
import byui.cit260.slip.model.Scene;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public class MapControl {

    public static Map createMap(){
        //create the map
        Map map = new Map(10, 10);

        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();

        //assign the different scens to locations in the map
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("Stubfunction called");
    }

    private static ImageIcon getImage(Scene finishScene, String link_to_JPG) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType {
        start,
        SantaClaus,
        elf,
        mountainIncline,
        battery,
        water,
        river,
        snow,
        rocks,
        trees,
        airPressure,
        cliff,
        deathScene,
        crevasse,
        plane,
        energyBar,
        tent,
        sleepingBag,
        camp,
        finsih;
    }
    
    private static Scene[] createScenes() throws MapControlException {
        BufferedImage image = null;

        Game game = Slip.getCurrentGame();

        Scene[] scenes = new Scene[Scene.SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(""
                + "\n You have arrived at the base of Mt. McKinley.  "
                + "\n It is 14 degrees Fahrenheit.  There is a lot of snow."
                + "\n The landscape is very beautiful.  Mt. McKinley looms over"
                + "\n where you are at now.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        ImageIcon startingSceneImage = MapControl.getImage(startingScene, "attach jpg picture here");
        /*startingScene.setIcon(startingSceneImage);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;*/

        Scene finishScene = new Scene();
        finishScene.setDescription("\n Congratulations!  You survived the wilderness of Mt. McKinley!");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        ImageIcon finishSceneImage = MapControl.getImage(finishScene, "link to JPG");
        /*finishScene.setIcon(finishSceneImage);
        scenes[Scene.SceneType.finish.ordinal()] = finishScene;*/

        return null;
    }
    
    private static void assignScenesToLocation (Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[1][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[1][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[2][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[2][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[3][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[3][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[4][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[4][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[5][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[5][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[6][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[6][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[7][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[7][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[8][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[8][9].setScene(scenes [SceneType.start.ordinal()]);
        
        locations[9][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][5].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][6].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][7].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][8].setScene(scenes [SceneType.start.ordinal()]);
        locations[9][9].setScene(scenes [SceneType.finsih.ordinal()]);
        
    }

}
