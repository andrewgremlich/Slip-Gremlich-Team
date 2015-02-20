/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

/**
 *
 * @author Richard
 */
public class HelpMenuView {
    
      private final String INSTRUCTIONS = "\n"
            + "\n -------------------------------"
            + "\n ***** Instruction Menu ********"
            + "\n--------------------------------"
            + "\nH - How to Move"
            + "\nR - Retrieving Resources"
            + "\nG - Goal of the Game"
            + "\nQ - Quit the Instructions Menu";
      
       public void displayMenu() {
       char selection = ' ';
       do {
           
           System.out.println(INSTRUCTIONS); // display instruction menu
           
           String input = this.getInput(); //get the user's selection
           selection = input.charAt(0); //get first character of string
           
           this.doAction(selection); //do action based on selection
           
        } while (selection != 'Q'); //an selection is not "Quit"
    }
      
       public void doAction (char choice) {
        switch (choice) {
            case 'H' : //How to move
                System.out.println("*****Test How to move****");
                break;
            case 'R' : //Resources info
                System.out.println("*****Test Gather Resources****");
                break;
            case 'G' : //Instructions
                System.out.println("*****Test Goal of game****");
                break;
            case 'Q' : //Quit program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                break;
            }
    }

    private String getInput() {
            System.out.println("Test input blalllll");
            //String return;
          return null;
    }
    
}
