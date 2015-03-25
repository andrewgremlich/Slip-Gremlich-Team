/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.ProgramControl;
import byui.cit260.slip.model.Player;

/**
 *
 * @author Richard
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\n*************************************************************************"
                + "\n Welcome to Slip"
                + "\n In this text based role playing game, "
                + "\n you will be put into a futuristic extreme "
                + "\n camping experience. "
                + "\n The goal is to hike to the summit of Mt. McKinley. "
                + "\n You will need to pit your wits against the environemnt and depression as you summit the mountain. "
                + "\n Let's hope you have the wits to pit with. "
                + "\n Keep telling yourself...it's only a game"
                + "\n  "
                + "\n Please input your name below."
                + "\n***************************************************************************");
    }

    //This code does not run because it is not called.
    @Override
    public boolean doAction(Object obj) {
        
        //This code calls for the input received.
        String playersName = ((String) obj);

        //This code calls the StartProgramView super display reference
        //The way that this way works is commenting out the "value" from the display of the superclass.
        //prompt the player to enter their name

        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        //Display personal welcome message
        this.displayWelcomeMessage(player);

        //Display the Main Menu
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n===================================");
        this.console.println("\tWelcome to the game " + player.getName());
        this.console.println("\tWe hope that you have a lot of fun!");
        this.console.println("=======================================");
    }

}
