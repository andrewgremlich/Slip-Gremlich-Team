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
    public void testCalcBoilingPoint() {
        
        
        //Test Case #1: Valid Input
        System.out.println("calcBoilingPoint");
        
        double airPressure = 5.0;
        int temperature = 3;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 12.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testCalcBoilingPointInvalid1() {
        
        //Test Case #2: Invalid Input for Temperature
        System.out.println("calcBoilingPoint");
        
        double airPressure = 5.0;
        int temperature = 'R';
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = -1.0;
        double result = instance.calcBoilingPoint(airPressure, temperature);
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
