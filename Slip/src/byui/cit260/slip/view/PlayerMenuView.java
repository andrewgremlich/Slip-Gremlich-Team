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
public class PlayerMenuView extends View{
    
    public PlayerMenuView(){
            super("\n"
            + "\n -------------------------------"
            + "\n ******* Player Menu ********"
            + "\n--------------------------------"
            + "\nH - Input Hair Color"
            + "\nE - Input Eye Color"
            + "\nG - Input Gender"
            + "\nQ - Quit the Player Menu"
            + "\n -------------------------------");
            
    }
       public void doAction (char choice) {
        switch (choice) {
            case 'h' : //Hair Color Input
               System.out.println("*****Test Hair Color Input****");
                // this.getPlayersHair();
                break;
            case 'e' : //Eye Color Input
                System.out.println("*****Test Eye Color Input****");
                break;
            case 'g' : //Gender Input
                System.out.println("*****Test Gender Input****");
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
