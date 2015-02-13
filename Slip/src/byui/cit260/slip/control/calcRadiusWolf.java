/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

/**
 *
 * @author Richard
 */
public class calcRadiusWolf {
    public double calRadiusWolf(double circumference) {

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
	
			
			
		 
	


