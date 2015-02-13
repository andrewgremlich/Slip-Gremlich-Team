/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcBoilingPoint method, of class InventoryControl.
     */
    @Test
    public void testCalcBoilingPoint1() {
        
        
        //Test Case #1: Valid Input
        System.out.println("calcBoilingPoint");
        
       
        int airPressure = 5;
        int temperature = 3;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 12.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
    /*@Test
    public void testCalcBoilingPointInvalid2() {
        
        //Test Case #2: Invalid Input for Temperature with letter
        System.out.println("calcBoilingPoint");
        
        
        int airPressure = 5;
        int temperature = 'R';
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = -1.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }*/
    
   /* @Test
    public void testCalcBoilingPointInvalid3() {
        
        //Test Case #3: Invalid Input for Temperature with symbol
        System.out.println("calcBoilingPoint");
        
        
        int airPressure = 5;
        int temperature = '&';
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = -1.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    */
    /*@Test
    public void testCalcBoilingPointInvalid4() {
        
        //Test Case #4: Invalid Input for airPressure for symbol
        System.out.println("calcBoilingPoint");
        

        int airPressure = 'h';
        int temperature = 3;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = -1.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }*/
    
    @Test
    public void testCalcBoilingPointInvalid5() {
        
        //Test Case #5: Invalid Input for airPressure with 0
        System.out.println("calcBoilingPoint");
        
        
        int airPressure = 0;
        int temperature = 3;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = -1.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testCalcBoilingPointInvalid6() {
        
        //Test Case #6: Invalid Input for airPressure with -3
        System.out.println("calcBoilingPoint");
        
        
        int airPressure = -3;
        int temperature = 3;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = -1.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testCalcBoilingPointInvalid7() {
        
        //Test Case #7: lowest boundary test
        System.out.println("calcBoilingPoint");
        
       
        int airPressure = 1;
        int temperature = -20;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 400.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testCalcBoilingPointInvalid8() {
        
        //Test Case #8: High boundary test
        System.out.println("calcBoilingPoint");
        
       
        int airPressure = 50;
        int temperature = 20;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 8.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
   

    /**
     * Test of calRadiusWolf method, of class calcRadiusWolf.
     */
    @Test
    public void testCalRadiusWolf() {
        
        //Test case 1 for valid input using whole number
        System.out.println("calRadiusWolf 1");
        
        double circumference = 12;
        InventoryControl instance = new InventoryControl();
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
