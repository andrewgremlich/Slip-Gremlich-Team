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
public class MoveView extends View {

    public MoveView() {
        super("\n"
                + "\n-------------------------------"
                + "\n| Select Direction to Move    |"
                + "\n-------------------------------"
                + "\n-- N -North                  "
                + "\n-- S -South                  "
                + "\n-- E -East            "
                + "\n-- W -West          "
                + "\n                               "
                + "\n  Q - Return                   ");

    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean doAction(Object obj) {
        char choice = ((String) obj).toLowerCase().charAt(0);
        switch (choice) {
            case 'n': //Move Player North
                System.out.println("You move slowly, but assuredly North");
                break;
            case 's': //Move Player South
                System.out.println("Good job. You carefully move South");
                break;
            case 'e': //Move Player East
                System.out.println("Putting one foot in-front of the other you are moving East");
                break;
            case 'w': //Move Player West
                System.out.println("Amazinlgy you move West" );
            case 'q': //Quit program
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return true;
    }

}
