/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

/**
 *
 * @author Andrew
 */
public class InventoryControl {
    
        public double calcBoilingPoint(double airPressure, int temperature){
            
            //the time variable is a static constant for the equation
            int time = 20;
            
            //This is checking for if a number is an integer by verifying if it is odd or even.
            if (temperature%2!=0 || temperature%2!=1) {
                return -1;
            }
            
            //check if the airPressure is inbetween 1-50
            if (airPressure<1 || 50<airPressure) {
                return -1;
            }
            
            //this is a hand-made equation to find boiling point
            double boil = Math.abs((temperature*time)/airPressure);
            
            return boil;
                    
        }
    }
}
