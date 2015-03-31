/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.GameControl;
import byui.cit260.slip.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-------------------------------"
                + "\n|        Main Menu            |"
                + "\n-------------------------------"
                + "\nS - Start Game"
                + "\nL - Load Game"
                + "\nI - Instructions"
                + "\nP - Player Menu"
                + "\n                               "
                + ""
                + "\n                             "
                + ""
                + "\n|                             |"
                + "\nQ - Quit Program"
                + "\n-------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        char choice = ((String) obj).toLowerCase().charAt(0);
        switch (choice) {
            case 's': {
                try {
                    this.startNewGame();
                } catch (MapControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'l': //load game
                this.loadGame();
                break;
            case 'i': //Instructions
                this.seeInstructions();
                break;
            case 'p': // Player Menu
                this.seePlayer();
                break;
            case 'q': //Quit program
                System.exit(0);
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return false;
    }

    private String playName() {
        boolean valid = false; //Indicates if the name has been retrived.
        String playersName = null;

        try {
            while (!valid) { // while a valid name has not been retrived

                //prompt for the player's name
                this.console.println("Please enter your name below:");

                //Get the name from the keyboard and trim off the blanks
                playersName = this.keyboard.readLine();
                playersName = playersName.trim();

                //If the name is invalid (less than two characters in length)
                if (playersName.length() < 2) {
                    ErrorView.display(this.getClass().getName(),
                            "Invalid name - the name must not be shorter than two characters");
                    continue; //and rpeat again
                }
                break; //stops repetiotion
            }

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return playersName; // returns the players name.
    }

    private void startNewGame()
            throws MapControlException {
        //Create new game
        GameControl.createNewGame(Slip.getPlayer());

        //display the game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        this.console.println("\n\nEnter the file path where the game is saved.");

        String filePath = this.getInput();

        try {
            //start a saved game
            GameControl.loadGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        //display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void seeInstructions() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void seePlayer() {
        PlayerMenuView playerMenu = new PlayerMenuView();
        playerMenu.display();
    }

    private void seeGame() {
        GameMenuView gameView = new GameMenuView();
        gameView.display();
    }

}
