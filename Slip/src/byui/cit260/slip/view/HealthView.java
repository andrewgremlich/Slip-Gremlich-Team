/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.FactorControl;
import byui.cit260.slip.exceptions.FactorControlException;
import byui.cit260.slip.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            case 'e': 
                this.console.println("Your Energy level is " );
                break;
            case 'h': 
                this.console.println("Your hunger level is (get attribute for hunger)");
                break;
            case 'd': 
                this.console.println("Your depression level is (get attribute for depression)");
                break;
            case 'o': {
            try {
                //display overall health
                this.console.println("Your overall health is " + FactorControl.findOverallHealth());
            } catch (FactorControlException ex) {
                Logger.getLogger(HealthView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            case 'q': //Quit program
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Please Try again");
                return false;
        }
        return true;
    }

}
