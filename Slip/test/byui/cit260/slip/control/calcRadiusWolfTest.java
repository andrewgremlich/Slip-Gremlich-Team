/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Richard
 */
public class calcRadiusWolfTest {
    
    public calcRadiusWolfTest() {
    }

    /**
     * Test of calRadiusWolf method, of class calcRadiusWolf.
     */
    @Test
    public void testCalRadiusWolf() {
        
        //Test case 1 for valid input using whole number
        System.out.println("calRadiusWolf 1");
        
        double circumference = 12;
        calcRadiusWolf instance = new calcRadiusWolf();
        double expResult = 1.91;
        double result = instance.calRadiusWolf(circumference);
        assertEquals(expResult, result, 0.0001);
        
        
        //Test case 2 for valid input using a fraction
        
        System.out.println("calRadiusWolf 2");
        circumference = 10.5;
        
        expResult = 1.67;
        result = instance.calRadiusWolf(circumference);
        assertEquals(expResult, result, 0.0001);
             
           
        /*Test case 3 for invalid input with a character
        
        System.out.println("calRadiusWolf 3");
        circumference = '&';
        
        expResult = -1;
        result = instance.calRadiusWolf(circumference);
        assertEquals(expResult, result, 0.0001);
        
              
        
         //Test case 4 for invalid input using a letter 
        
        System.out.println("calRadiusWolf 4");
        circumference = 'R';
        
        
        expResult = -1;
        result = instance.calRadiusWolf(circumference);
        assertEquals(expResult, result, 0.0001);
        */
   
         //Test case 5 for invalid input using a negative integer
        
        System.out.println("calRadiusWolf 5");
        circumference = -4;
        
        expResult = -1;
        result = instance.calRadiusWolf(circumference);
        assertEquals(expResult, result, 0.0001);
        
        
         //Test case 6 for boundary minimum of 1
        
        System.out.println("calRadiusWolf 6");
        circumference = 1;
        
        expResult = .16;
        result = instance.calRadiusWolf(circumference);
        assertEquals(expResult, result, 0.0001);
    }
}
