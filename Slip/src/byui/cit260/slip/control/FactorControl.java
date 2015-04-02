/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import byui.cit260.slip.exceptions.FactorControlException;
import byui.cit260.slip.model.Actor;
import byui.cit260.slip.view.View;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrew
 */
public class FactorControl {

    public double calcAttackingPower(double energyLevel, double toolPower)
            throws FactorControlException {

        //Check if any input is 0
        if (energyLevel == 0 || toolPower == 0) {
            return 0;
        }

        //Check for the boundaries of the function
        if (energyLevel < 0 || 10 < energyLevel) {
            throw new FactorControlException("Cannot attack with those numbers."
                    + "They are out of your ability.");
        }

        if (toolPower < 0 || 8 < toolPower) {
            throw new FactorControlException("Cannot attack with those numbers."
                    + "They are out of your ability.");
        }

        //Check for an integer number.
        if (energyLevel % 1 != 0 && toolPower % 1 != 0) {
            throw new FactorControlException("You can only attack with a whole "
                    + "integer input number.");
        } //Calculate attacking power and return value;
        else {
            double attackingPower = energyLevel + toolPower;
            System.out.println("Your attacking about is " + attackingPower + ".");

            return attackingPower;
        }

    }

    public static double calculateAverageHealth() {

        Actor[] health = Actor.values();

        double findAverageHealth = FactorControl.findAverageHealth(health);
        return findAverageHealth;
    }

    private static double findAverageHealth(Actor[] health) {

        int total = 0;

        for (Actor totalHealth : health) {
            total = total + totalHealth.getHealth();
        }

        double average = total / health.length;
        return average;
    }

    public static int findOverallHealth()
            throws FactorControlException {

        int calculateOverallHealth = calculateOverallHealth();

        if (calculateOverallHealth <= 0) {
            throw new FactorControlException("You are dead.  Try again?  "
                    + "\nStart a new game.");
        } else {
            return calculateOverallHealth;
        }
    }

    private static int calculateOverallHealth() {
        int health = energy - ((depression + hunger) / 2);
        return health;
    }

}
