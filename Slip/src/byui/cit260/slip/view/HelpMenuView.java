/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n -------------------------------"
                + "\n ***** Instruction Menu ********"
                + "\n--------------------------------"
                + "\nH - How to Move"
                + "\nR - Retrieving Resources"
                + "\nG - Goal of the Game"
                + "\nQ - Quit the Instructions Menu"
                + "\n--------------------------------");

    }

    @Override
    public boolean doAction(Object obj) {
        char choice = ((String) obj).toLowerCase().charAt(0);
        switch (choice) {
            case 'h': //How to move
                this.console.println("*****Test How to move****");
                break;
            case 'r': //Resources info
                this.console.println("*****Test Gather Resources****");
                break;
            case 'g': //Instructions
                this.console.println("*****Test Goal of game****");
                break;
            case 'q': //return to main menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return true;
    }

}
