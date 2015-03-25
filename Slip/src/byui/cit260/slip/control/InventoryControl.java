/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;


import byui.cit260.slip.exceptions.InventoryControlException;
import byui.cit260.slip.model.InventoryItem;
import byui.cit260.slip.view.View;


/**
 *
 * @author Andrew
 */
public class InventoryControl extends View{

    public double calcBoilingPoint(int airPressure, int temperature) throws InventoryControlException{

        //the time variable is a static constant for the equation
        int TIME = 20;

        //check if the airPressure is inbetween 1-50
        if (airPressure < 1 || 50 < airPressure) {
            throw new InventoryControlException("Cannot attack with those numbers."
                    + "They are out of your ability.");
        }

        //check if the temperature is between -20 and 20
        if (temperature < -20 || 20 < temperature) {
            throw new InventoryControlException("Cannot attack with those numbers."
                    + "They are out of your ability.");
        }

        //this is a hand-made equation to find boiling point and if it is a number
        if (temperature % 1 == 0 && airPressure % 1 == 0) {
            double boil = Math.abs((temperature * TIME) / airPressure);
            return boil;
        } else {
            throw new InventoryControlException("Cannot attack with those numbers."
                    + "They are out of your ability.");
        }
    }

    public double calcRadiusWolf(double circumference) throws InventoryControlException {

        //Check to see if circumerfernce input is greater than zero.	
        if (circumference > 0) {

            double radius = Math.round(circumference / (2 * Math.PI) * 100.0) / 100.0;
          this.console.println("You will be protected from the wolves within the radius of " + radius + " feet");

            return radius; //return to view layer InventoryMenuView

        } else {
            throw new InventoryControlException("Sorry. The number must be greater "
                    + "than zero.");
        }
    }

  
            }

