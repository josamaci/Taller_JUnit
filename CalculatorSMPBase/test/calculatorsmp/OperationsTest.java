/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsmp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JMaci
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void NumbersAndOperators() {
        System.out.println("MakeFormula");
        String result = Operations.MakeFormula();
        assertTrue("Si tiene signo", result.contains("+") || result.contains("-") || result.contains("/") || result.contains("*"));
        assertTrue("Contiene numeros", result.contains("0") || result.contains("1") || result.contains("2") || result.contains("3")
                || result.contains("4") || result.contains("5") || result.contains("6")|| result.contains("7") || result.contains("8")
                || result.contains("9"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Solve method, of class Operations.
     */
    /*@Test
    public void testSolve() {
        System.out.println("Solve");
        String formula = "";
        String expResult = "";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
