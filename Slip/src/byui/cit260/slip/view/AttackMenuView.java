/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.FactorControl;
import byui.cit260.slip.exceptions.FactorControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrew
 */
public class AttackMenuView extends View {

    public AttackMenuView() {
        super("\n"
                + "\n-------------------------------"
                + "\n|        Attack Input         |"
                + "\n-------------------------------");

    }

    @Override
    public void display() {

        boolean valid = false;
        double display = 0;

        while (!valid) {

            this.console.println(this.getPromptMessage()); // display main menu
            
            try{
            this.console.println("Enter tool power.");
            String input = this.getInput(); //get the user's selection
            double toolPower = Double.parseDouble(input);

            this.console.println("Enter health level.");
            input = this.getInput(); //get the user's selection
            double energyLevel = Double.parseDouble(input);
            
            double[] inputs = new double[2];
            inputs[0] = toolPower;
            inputs[1] = energyLevel;
            
            this.doAction(inputs);
            
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number with in the range of 1-10."
                        + "  Try again or enter Q to quit.");
            }
        }

    }

    @Override
    public boolean doAction(Object obj) {
        double[] inputs = (double[]) obj;
        double attackPower = 0;
        try {             //error wants to add FactorControl constructor to FactorControlcontrol which already exists
            attackPower = new FactorControl("").calcAttackingPower(inputs[1], inputs[0]); 
        }
        catch (FactorControlException ex) {
            Logger.getLogger(AttackMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.console.println("Your attack power is " + attackPower);
        return true;
    }
        
}
