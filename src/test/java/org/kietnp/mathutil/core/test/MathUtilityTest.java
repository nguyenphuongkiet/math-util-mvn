/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.kietnp.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.kietnp.mathutil.core.MathUtility;

/**
 *
 * @author admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentRunsWell(){
        assertEquals(69, 69);
        assertEquals( 1, MathUtility.getFactorialRecursion(1));
        assertEquals( 2, MathUtility.getFactorialRecursion(2));
        assertEquals( 6, MathUtility.getFactorialRecursion(3));
        assertEquals( 24, MathUtility.getFactorialRecursion(4));
        assertEquals( 120, MathUtility.getFactorialRecursion(5));
        
    }
    
    
    
}
