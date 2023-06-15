/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.kietnp.mathutil.core.test;

import static org.kietnp.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.kietnp.mathutil.core.MathUtility;

public class MathUtilityAdvancedTest {

    //Đây là hàm để chuẩn bị bộ test data để sau đó fill vào hàm
    //assert() ở dưới
    public static Object[][] initTestData() {
        Object testData[][] = { {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120}};

        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell1(int n, long expected) {
        assertEquals(1, getFactorial(0));
    }
    
    @Test
    public void testFactorialGivenRightArgumentRunsWell() {
        assertEquals(1, getFactorial(0));
    }
    
    @Test
    public void testFactorialGivenWrongArgumentThrowException(){
        Executable gF = new Executable() {
            @Override
            public void execute() throws Throwable {
                MathUtility.getFactorial(-1);
            }
        };
        //hàm thuộc về interface Executable
        Executable gF2 = () -> MathUtility.getFactorial(-1);
        
        assertThrows(IllegalArgumentException.class, gF2);
    }

}
