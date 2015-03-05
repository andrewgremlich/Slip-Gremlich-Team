/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.GameControl;
import java.util.Scanner;
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
                + "\n                             "
                + "\nT  - Inventory Menu"
                + "\n|                             |"
                + "\nQ - Quit Program"
                + "\n-------------------------------");
    }

    @Override
    public void doAction(Object obj) {
        char choice = ((String) obj).toLowerCase().charAt(0);
        switch (choice) {
            case 's': //Start a new game
                this.startNewGame();
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
            case 't': // Inventory Menu
                this.seeInventory();
                break;
            case 'q': //Quit program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                break;
        }
    }

    private String playName() {
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
                System.out.println("Invalid name - the name must not be shorter than two characters");
                continue; //and rpeat again
            }
            break; //stops repetiotion

        }
        return playersName; // returns the players name.
    }

    private void startNewGame() {
        //Create new game
        GameControl.createNewGame(Slip.getPlayer());

        //display the game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void seeInstructions() {
        HelpMenuView helpMenu = new HelpMenuView();
    }

    private void seePlayer() {
        PlayerMenuView playerMenu = new PlayerMenuView();
    }

    private void seeInventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
    }

}
