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
                + "\n-- N -North                    "
                + "\n-- S -South                    "
                + "\n-- E -East                     "
                + "\n-- W -West                     "
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
                this.console.println("You move slowly, but assuredly North.");
                break;
            case 's': //Move Player South
                this.console.println("Good job, you are moving South.");
                break;
            case 'e': //Move Player East
                this.console.println("Putting one foot in-front of the other you are moving East.");
                break;
            case 'w': //Move Player West
                this.console.println("Pleased with your ability to walk upright, you move West." );
            case 'q': //Quit Menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return true;
    }

}
