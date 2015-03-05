/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.ProgramControl;
import byui.cit260.slip.model.Player;
import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class StartProgramView extends View {

    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }

    public void startProgram() {

        this.displayBanner();

        //prompt the player to enter their name
        String playersName = this.getPlayersName();

        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        //Display personal welcome message
        this.displayWelcomeMessage(player);

        //Display the Main Menu
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

    }

    private void displayBanner() {
        System.out.println("\n\n*************************************************************************"
                + "\n Welcome to Slip");

        System.out.println(""
                + "\n In this text based role playing game, "
                + "\n you will be put into a futuristic extreme "
                + "\n camping experience. "
                + "\n\n The goal is to hike to the summit of Mt. McKinley. "
                + "\n You will need to pit your wits against the environemnt and depression as you summit the mountain. "
                + "\n Let's hope you have the wits to pit with. "
                + "\n\n Keep telling yourself...it's only a game");

        System.out.println("\n***************************************************************************");
    }

    private String getPlayersName() {
        boolean valid = false; //Indicates if the name has been retrived.
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input 

        while (!valid) { // while a valid name has not been retrived

            //prompt for the player's name
            System.out.println("Please enter your name below:");

            //Get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            //If the name is invalid (less than two characters in length)
            if (playersName.length() < 2) {
                System.out.println("Sorry - your name must be greater than two characters");
                continue; //and repeat again
            }
            break; //stops repetition

        }
        return playersName; // returns the players name.
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n===================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope that you have a lot of fun!");
        System.out.println("=======================================");
    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
