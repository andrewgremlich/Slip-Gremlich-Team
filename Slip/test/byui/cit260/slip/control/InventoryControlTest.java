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
}
