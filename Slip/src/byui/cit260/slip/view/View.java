/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public abstract class View implements ViewInterface { //View SuperClass!!!

    String promptMessage;

    protected final BufferedReader keyboard = Slip.getInFile();
    protected final PrintWriter console = Slip.getOutFile();

    public View(String promptMessage) {//Contructor Function!!!!
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }

    @Override
    public void display() {
        String value;
        boolean done = false;
        do {
            //This line should be the only one to show that it works.
            this.console.println(promptMessage); // display main menu

            value = this.getInput(); //get the user's selection
            //selection = input.charAt(0); //get first character of string

            done = this.doAction(value); //do action based on selection

        } while (!done); //an selection is not "Quit"

    }

    @Override
    public String getInput() {
        boolean valid = false; //Indicates if the name has been retrived.
        String selection = null;

        try {
            while (!valid) { // while a valid name has not been retrived

                //prompt for the player's name
                this.console.println("Please put in your input:");

                //Get the name from the keyboard and trim off the blanks
                selection = this.keyboard.readLine();
                selection = selection.trim();

                if (selection.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n**** Invalid Selection.  Please try again...");
                    continue;
                }
                break; //stops repetiotion
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return selection; // returns the players menu selection.
    }

}
