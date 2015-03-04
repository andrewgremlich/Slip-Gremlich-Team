/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import byui.cit260.slip.control.FactorControl;
import java.util.Scanner;


/**
 *
 * @author Andrew
 */
public class AttackMenuView extends View{
    
   
    public AttackMenuView(){
            super("\n"
            +"\n-------------------------------"
            + "\n|        Attack Input         |"
            + "\n-------------------------------");
            
            
    }
  
    @Override
    public void display() {
        
       boolean valid = false;
       double display = 0;
       
       while (!valid) {
           
           System.out.println(this.getPromptMessage()); // display main menu
           
           System.out.println("Enter tool power.");
           String input = this.getInput(); //get the user's selection
           double toolPower = Double.parseDouble(input);
           
           System.out.println("Enter health level.");
           input = this.getInput(); //get the user's selection
           double energyLevel = Double.parseDouble(input);          
           
           double[] inputs = new double[2];
           inputs[0] = toolPower;
           inputs[1] = energyLevel;
           
           this.doAction(inputs);
              
        } 
      
    }

    @Override
    public void doAction(Object obj) { 
        double[] inputs = (double[]) obj;
        double attackPower = new FactorControl().calcAttackingPower(inputs[1], inputs[0]);
        System.out.println("Your attack power is " + attackPower);
    }
    
   
   
}
