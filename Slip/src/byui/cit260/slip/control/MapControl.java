/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import byui.cit260.slip.exceptions.MapControlException;
import byui.cit260.slip.model.Actor;
import byui.cit260.slip.model.Game;
import byui.cit260.slip.model.Location;
import byui.cit260.slip.model.Map;
import byui.cit260.slip.model.Scene;
import java.awt.Point;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public class MapControl {

    public Map createMap() throws MapControlException {
        //create the map
        Map map = new Map(10, 10);

        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();

        //assign the different scens to locations in the map
        assignScenesToLocations(map, scenes);

        return map;
    }

    public static void moveActorsToStartingLocation(Map map)
            throws MapControlException {
        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);

        }

    }

    public static void moveActorToLocation(Actor actor, Point newCoordinates)
            throws MapControlException {

        Map map = Slip.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();

        Point oldCoordinates = actor.getCoordinates();
        Location oldLocation = locations[oldCoordinates.x - 1][oldCoordinates.y - 1];

        Location newLocation = locations[newCoordinates.x - 1][newCoordinates.y - 1];
//        locations = Actor.Phil.getCoordinates();
        

        oldLocation = null;

        if (newCoordinates.x < 0 || newCoordinates.x >= map.getNoOfRows() || newCoordinates.y < 0 || newCoordinates.y >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location "
                    + newCoordinates.x + ", " + newCoordinates.y
                    + "because that location is outside "
                    + "the bounds of the map.");
        }
        newLocation.setVisited(true);

    }

    public enum SceneType {

        start,
        santaClaus,
        elf,
        mountainIncline,
        river,
        rocks,
        trees,
        cliff,
        death,
        crevasse,
        abominable,
        camp,
        normal,
        finish;
    }

    private static Scene[] createScenes() throws MapControlException {

        Game game = Slip.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(""
                + "\n You have arrived at the base of Mt. McKinley.  "
                + "\n It is 14 degrees Fahrenheit.  There is a lot of snow."
                + "\n The landscape is very beautiful."
                + "\n To the far east lies the Traleika Glacier. To the North West you can just make out the Peters Glacier. "
                + "\n Mt. McKinley looms menacingly overhead. "
                + "\n You have spent the last year preparing to summit the south face of McKinley."
                + "\n You and your team will summit the mountain following the West Bustress Route.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        startingScene.setDepression(0);
        startingScene.setEnergy(10);
        startingScene.setHunger(0);
        startingScene.setSteepTerrain(0);
        startingScene.setSnowDepth(0);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene santaClausScene = new Scene();
        santaClausScene.setDescription("You have found Santa Claus!  Go and get a present!  Santa "
                + "\nis so nice that he gives you an incredible tool and he gives you energy"
                + "\nto continue on.");
        santaClausScene.setMapSymbol(" SC ");
        santaClausScene.setBlocked(false);
        santaClausScene.setTravelTime(50);
        santaClausScene.setDepression(0);
        santaClausScene.setEnergy(10);
        santaClausScene.setHunger(0);
        santaClausScene.setSteepTerrain(0);
        santaClausScene.setSnowDepth(3);
        scenes[SceneType.santaClaus.ordinal()] = santaClausScene;

        Scene elfScene = new Scene();
        elfScene.setDescription("You have found an elf!  How strange.  The elf tells you to keep"
                + "\nan eye out for Santa Claus. Little does the elf know, you stopped believing "
                + "\nin Santa Claus months ago. He gives you energy and you feel great too."
                + "\ncontinue playing.");
        elfScene.setMapSymbol(" EF ");
        elfScene.setBlocked(false);
        elfScene.setTravelTime(50);
        elfScene.setDepression(0);
        elfScene.setEnergy(10);
        elfScene.setHunger(0);
        elfScene.setSteepTerrain(0);
        elfScene.setSnowDepth(3);
        scenes[SceneType.elf.ordinal()] = elfScene;

        Scene mountainInclineScene = new Scene();
        mountainInclineScene.setDescription("The mountain incline here is really steep!"
                + "\nit will take some time to climb it.");
        mountainInclineScene.setMapSymbol(" // ");
        mountainInclineScene.setBlocked(false);
        mountainInclineScene.setTravelTime(300);
        mountainInclineScene.setDepression(3);
        mountainInclineScene.setEnergy(8);
        mountainInclineScene.setHunger(3);
        mountainInclineScene.setSteepTerrain(6);
        mountainInclineScene.setSnowDepth(2);
        scenes[SceneType.mountainIncline.ordinal()] = mountainInclineScene;

        Scene riverScene = new Scene();
        riverScene.setDescription("There is a running river.  The river calms you down"
                + "\njust a little bit and you continue with your course. Unfortunately you really have the urge"
                + "\nto use the restroom. Dang it!--Just ignore it, I'm sure the urge will go away.");
        riverScene.setMapSymbol(" ~~ ");
        riverScene.setBlocked(false);
        riverScene.setTravelTime(75);
        riverScene.setDepression(2);
        riverScene.setEnergy(8);
        riverScene.setHunger(3);
        riverScene.setSteepTerrain(2);
        riverScene.setSnowDepth(2);
        scenes[SceneType.river.ordinal()] = riverScene;

        Scene rocksScene = new Scene();
        rocksScene.setDescription("There are a lot of rocks!  You carefully go across them"
                + "\nso that you do not slip and sprain an ankle.");
        rocksScene.setMapSymbol(" oo ");
        rocksScene.setBlocked(false);
        rocksScene.setTravelTime(150);
        rocksScene.setDepression(2);
        rocksScene.setEnergy(7);
        rocksScene.setHunger(1);
        rocksScene.setSteepTerrain(2);
        rocksScene.setSnowDepth(2);
        scenes[SceneType.rocks.ordinal()] = rocksScene;

        Scene treesScene = new Scene();
        treesScene.setDescription("You are walking through a small forest.  It is"
                + "beautiful and very relaxing.  But there is the wolf!  Be careful!");
        treesScene.setMapSymbol(" /! ");
        treesScene.setBlocked(false);
        treesScene.setTravelTime(65);
        treesScene.setDepression(2);
        treesScene.setEnergy(9);
        treesScene.setHunger(1);
        treesScene.setSteepTerrain(2);
        treesScene.setSnowDepth(3);
        scenes[SceneType.trees.ordinal()] = treesScene;

        Scene cliffScene = new Scene();
        cliffScene.setDescription("A cliff is in front of you.  There is no way to go"
                + "\nthrough.  You must go around.");
        cliffScene.setMapSymbol(" -| ");
        cliffScene.setBlocked(true);
        cliffScene.setTravelTime(300);
        cliffScene.setDepression(4);
        cliffScene.setEnergy(7);
        cliffScene.setHunger(1);
        cliffScene.setSteepTerrain(2);
        cliffScene.setSnowDepth(2);
        scenes[SceneType.cliff.ordinal()] = cliffScene;

        Scene deathScene = new Scene();
        deathScene.setDescription("You died. Felecious the wolf found you and ate you. "
                + "\nDon't feel too bad, the whole circle of life thing, you know.");
        deathScene.setMapSymbol(" ## ");
        deathScene.setBlocked(true);
        deathScene.setTravelTime(300);
        deathScene.setDepression(4);
        deathScene.setEnergy(0);
        deathScene.setHunger(1);
        deathScene.setSteepTerrain(2);
        deathScene.setSnowDepth(2);
        scenes[SceneType.death.ordinal()] = deathScene;

        Scene abominableScene = new Scene();
        deathScene.setDescription("Amazing! As you glance around you notice the Abominable Snowman. "
                + "\nAs you reach for your camera with the thought of riches and fame, it occurs to you that"
                + "\nthe Abominable Snowman is moving quickly. Before you can react the Abonimable Snowman"
                + "\nis upon you seperating you from your beloved legs. Don't worry the Abominable Snowman"
                + "\nuses all parts of the individual, your femers will make wonderful rainsticks."
                + "\nYou die wondering, are those my feet?");
        abominableScene.setMapSymbol(" @@ ");
        abominableScene.setBlocked(true);
        abominableScene.setTravelTime(300);
        abominableScene.setDepression(4);
        abominableScene.setEnergy(0);
        abominableScene.setHunger(1);
        abominableScene.setSteepTerrain(2);
        abominableScene.setSnowDepth(2);
        scenes[SceneType.abominable.ordinal()] = abominableScene;

        Scene crevasseScene = new Scene();
        crevasseScene.setDescription("That last step was a doozy! You fell into a crevasse and died.");
        crevasseScene.setMapSymbol(" || ");
        crevasseScene.setBlocked(true);
        crevasseScene.setTravelTime(300);
        crevasseScene.setDepression(4);
        crevasseScene.setEnergy(0);
        crevasseScene.setHunger(1);
        crevasseScene.setSteepTerrain(2);
        crevasseScene.setSnowDepth(2);
        scenes[SceneType.crevasse.ordinal()] = crevasseScene;

        Scene campScene = new Scene();
        campScene.setDescription("There is a camp here.  You go to the camp to get"
                + "\nmore energy and to eat.  You feel well the next morning and you"
                + "\ncontinue to hike.");
        campScene.setMapSymbol(" CP ");
        campScene.setBlocked(false);
        campScene.setTravelTime(70);
        campScene.setDepression(0);
        campScene.setEnergy(10);
        campScene.setHunger(0);
        campScene.setSteepTerrain(4);
        campScene.setSnowDepth(3);
        scenes[SceneType.camp.ordinal()] = campScene;

        Scene normalScene = new Scene();
        normalScene.setDescription("You pass through this scene and you enjoy"
                + "\nthe view. It's times like this that puts life into perpective.");
        normalScene.setMapSymbol(" NN ");
        normalScene.setBlocked(false);
        normalScene.setTravelTime(25);
        normalScene.setDepression(2);
        normalScene.setEnergy(10);
        normalScene.setHunger(2);
        normalScene.setSteepTerrain(2);
        normalScene.setSnowDepth(3);
        scenes[SceneType.normal.ordinal()] = normalScene;

        Scene finishScene = new Scene();
        finishScene.setDescription("\n Congratulations!  You survived the wilderness of Mt. McKinley!"
                + "\nThis experience is something you will share with your children, for years to come.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        finishScene.setDepression(2);
        finishScene.setEnergy(5);
        finishScene.setHunger(1);
        finishScene.setSteepTerrain(0);
        finishScene.setSnowDepth(0);
        scenes[SceneType.finish.ordinal()] = finishScene;

        return scenes;

    }

    /**
     *
     * @param map
     * @param scenes
     * @return
     */
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.crevasse.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.normal.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.elf.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.normal.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.normal.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.normal.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.normal.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.normal.ordinal()]);

        locations[1][0].setScene(scenes[SceneType.camp.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.death.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.normal.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.normal.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.crevasse.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.santaClaus.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.cliff.ordinal()]);

        locations[2][0].setScene(scenes[SceneType.normal.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.river.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.normal.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.death.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.normal.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.cliff.ordinal()]);

        locations[3][0].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.normal.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.finish.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.river.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.camp.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.crevasse.ordinal()]);

        locations[4][0].setScene(scenes[SceneType.crevasse.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.normal.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.start.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.normal.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.rocks.ordinal()]);

        locations[5][0].setScene(scenes[SceneType.normal.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.normal.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.camp.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.normal.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.river.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.normal.ordinal()]);

        locations[6][0].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.normal.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.death.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.normal.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.normal.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.death.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.river.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.river.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.cliff.ordinal()]);

        locations[7][0].setScene(scenes[SceneType.trees.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.normal.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.camp.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.normal.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.trees.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.abominable.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.river.ordinal()]);

        locations[8][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.trees.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.mountainIncline.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.death.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.trees.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.normal.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.elf.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.river.ordinal()]);

        locations[9][0].setScene(scenes[SceneType.normal.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.trees.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.trees.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.normal.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.trees.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.camp.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.rocks.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.trees.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.crevasse.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.river.ordinal()]);

    }

}
