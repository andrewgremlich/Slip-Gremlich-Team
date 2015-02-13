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
 * @author Andrew
 */
public class FactorControlTest {
    
    public FactorControlTest() {
    }

    /**
     * Test of calcAttackingPower method, of class FactorControl.
     */
    @Test
    public void testCalcAttackingPower1() {
        
        //Test Case #1 - Valid Inputs
        System.out.println("calcAttackingPower");
        
        int energyLevel = 10;
        int toolPower = 7;
        
        FactorControl instance = new FactorControl();
        
        double expResult = 17.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testCalcAttackingPower2() {
        
        //Test Case #2 - Invalid input too high energy level
        System.out.println("calcAttackingPower");
        
        int energyLevel = 11;
        int toolPower = 7;
        
        FactorControl instance = new FactorControl();
        
        double expResult = -1.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testCalcAttackingPower3() {
        
        //Test Case #3 - Invalid input too high toolPower
        System.out.println("calcAttackingPower");
        
        int energyLevel = 8;
        int toolPower = 11;
        
        FactorControl instance = new FactorControl();
        
        double expResult = -1.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testCalcAttackingPower4() {
        
        //Test Case #4 - Invalid input for energy level, too low
        System.out.println("calcAttackingPower");
        
        int energyLevel = -2;
        int toolPower = 3;
        
        FactorControl instance = new FactorControl();
        
        double expResult = -1.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testCalcAttackingPower5() {
        
        //Test Case #5 - Invalid input for tool power, too low
        System.out.println("calcAttackingPower");
        
        int energyLevel = 3;
        int toolPower = -4;
        
        FactorControl instance = new FactorControl();
        
        double expResult = -1.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
    
    /*@Test
    public void testCalcAttackingPower6() {
        
        //Test Case #6 - Invalid input for energy level, can't be a character
        System.out.println("calcAttackingPower");
        
        int energyLevel = 'a';
        int toolPower = 4;
        
        FactorControl instance = new FactorControl();
        
        double expResult = -1.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }*/
    
    /*@Test
    public void testCalcAttackingPower7() {
        
        //Test Case #7 - Invalid input for toolPower, must be a number
        System.out.println("calcAttackingPower");
        
        int energyLevel = 2;
        int toolPower = 'a';
        
        FactorControl instance = new FactorControl();
        
        double expResult = -1.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }*/
    
    @Test
    public void testCalcAttackingPower8() {
        
        //Test Case #8 - Boundary test for energyLevel
        System.out.println("calcAttackingPower");
        
        int energyLevel = 10;
        int toolPower = 0;
        
        FactorControl instance = new FactorControl();
        
        double expResult = 0.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testCalcAttackingPower9() {
        
        //Test Case #9 - Boundary test for toolpower
        System.out.println("calcAttackingPower");
        
        int energyLevel = 0;
        int toolPower = 8;
        
        FactorControl instance = new FactorControl();
        
        double expResult = 0.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testCalcAttackingPower10() {
        
        //Test Case #10 - Boundary test with energylevel and toolpower high.
        System.out.println("calcAttackingPower");
        
        int energyLevel = 10;
        int toolPower = 8;
        
        FactorControl instance = new FactorControl();
        
        double expResult = 18.0;
        double result = instance.calcAttackingPower(energyLevel, toolPower);
        
        assertEquals(expResult, result, 0.0001);
        
    }
}
