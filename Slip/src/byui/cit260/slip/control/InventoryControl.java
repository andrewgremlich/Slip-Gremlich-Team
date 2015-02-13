/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import java.io.IOException;

/**
 *
 * @author Andrew
 */
public class InventoryControl {
    
        public double calcBoilingPoint(int airPressure, int temperature){
            
            //the time variable is a static constant for the equation
            int TIME = 20;
         
            //check if the airPressure is inbetween 1-50
            if (airPressure<1 || 50<airPressure) {
                return -1;
            }
            
            //check if the temperature is between -20 and 20
            if (temperature<-20 || 20<temperature) {
                return -1;
            }
            
            //this is a hand-made equation to find boiling point and if it is a number
            
            if (temperature%1 == 0 && airPressure%1 == 0) {
                double boil = Math.abs((temperature*TIME)/airPressure);
               return boil;
            }
            
            else {
             return -1;   
            }
            }
        
        
        public double calcRadiusWolf(double circumference) {

            //Check to see if circumerfernce is greater than zero and a number.	
            if (circumference > 0) { 
            
            double radius = Math.round(circumference/(2*Math.PI)*100.0)/100.0;
            return radius;
            }
            else {
            return -1;	
            }
    }

             
            
        }
    

