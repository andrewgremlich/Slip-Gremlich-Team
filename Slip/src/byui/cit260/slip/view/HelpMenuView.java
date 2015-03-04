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
public class HelpMenuView extends View{
    
      public HelpMenuView(){
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
      
      public void doAction (char choice) {
        switch (choice) {
            case 'h' : //How to move
                System.out.println("*****Test How to move****");
                break;
            case 'r' : //Resources info
                System.out.println("*****Test Gather Resources****");
                break;
            case 'g' : //Instructions
                System.out.println("*****Test Goal of game****");
                break;
            case 'q' : //Quit program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                break;
            }
    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
