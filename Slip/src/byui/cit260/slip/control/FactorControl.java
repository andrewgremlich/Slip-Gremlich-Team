/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import byui.cit260.slip.model.Actor;

/**
 *
 * @author Andrew
 */
public class FactorControl {

    public double calcAttackingPower(double energyLevel, double toolPower) {

        //Check if any input is 0
        if (energyLevel == 0 || toolPower == 0) {
            return 0;
        }

        //Check for the boundaries of the function
        if (energyLevel < 0 || 10 < energyLevel) {
            return -1;
        }

        if (toolPower < 0 || 8 < toolPower) {
            return -1;
        }

        //Check for an integer number.
        if (energyLevel % 1 != 0 && toolPower % 1 != 0) {
            return -1;
        } //Calculate attacking power and return value;
        else {
            double attackingPower = energyLevel + toolPower;
            System.out.println("Your attacking about is " + attackingPower + ".");

            return attackingPower;
        }

    }

//    average(list): number
//        BEGIN
//        total = 0
//            FOR index = 0 TO list.length -1
//                total = total + list[index]
//            ENDFOR
//                average = total / sizeOfList
//            RETURN average
//        END
    
    public double calculateAverageHealth() {
        
        Actor[] health = Actor.values();
        
        double findAverageHealth = this.findAverageHealth(health);
        return findAverageHealth;
    }

    private double findAverageHealth(Actor[] health) {
        
        int total = 0;
        
        for (Actor totalHealth : health) {
            total = total + totalHealth.getHealth();
        }
        
        double average = total / health.length;
        return average;
    }

}
