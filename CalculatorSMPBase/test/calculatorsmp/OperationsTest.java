/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsmp;

import java.util.LinkedList;
import java.util.Stack;
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
        LinkedList<Character> operators = new LinkedList<>();
        operators.add('+');
        operators.add('-');
        operators.add('*');
        operators.add('/');
 
        boolean hasNumbers = false;
        boolean hasOperators = false;
 
        for (char character : result.toCharArray()) {
            if (Character.isDigit(character)) {
                hasNumbers = true;
            } else if (operators.contains(character)) {
                hasOperators = true;
            } else {
                hasNumbers = false;
                hasOperators = false;
                break;
            }
        }
        assertTrue(hasNumbers && hasOperators);
    }
    
    public void MinimalRequirement() {
        System.out.println("MakeFormula");
        String result = Operations.MakeFormula();
        Stack<Character> s = new Stack<>();
        int contOp = 0;
        int contNum = 0;
        for(char c: result.toCharArray()){
            s.push(c);
        }
        while(!s.isEmpty()){
            char c = s.pop();
            boolean isOperator = c=='+' || c=='-' || c=='*' || c=='/';
            if(isOperator){
                contOp++;
            }else if(Character.isDigit(c)){
                if(!s.isEmpty() && Character.isDigit(s.peek())){
                    s.pop();
                    contNum++;
                }else{
                    contNum++;
                }
            }else{
                 break;
            }
        }
        System.out.println(contNum+" "+contOp);
        assertTrue("Contiene al menos 3 números y 2 operadores.", contOp>=2 && contNum>=3);
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
