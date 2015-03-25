/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

/**
 *
 * @author Andrew
 */
public class HealthView extends View {

    public HealthView() {
        super("\n"
                + "\n-------------------------------"
                + "\n|        Health View         |"
                + "\n-------------------------------"
                + "\n-- E -Energy                  "
                + "\n-- H -Hunger                  "
                + "\n-- D -Depresssion             "
                + "\n-- O -Overall Health          "
                + "\n                               "
                + "\n  Q - Return                   ");

    }

    @Override
    public boolean doAction(Object obj) {
        char choice = ((String) obj).toLowerCase().charAt(0);
        switch (choice) {
            case 'e': //How to move
                this.console.println("Your Energy level is (Call in attribute for hunger)");
                break;
            case 'h': //Resources info
                this.console.println("Your hunger level is (Call in attribute for hunger)");
                break;
            case 'd': //Instructions
                this.console.println("Your depression level is (Call in attribute for depression)");
                break;
            case 'o': //display overall health
                this.console.println("Your overall health is (Call in attribute for overall health)" );
            case 'q': //Quit program
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return true;
    }

}
