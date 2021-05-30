/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author 2dam
 */
public class ModelImplementationTest {
    
    public ModelImplementationTest() {
    }
    private Model model;
    @Before
    public void SetUp(){
        model=new ModelImplementation();
    }
    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        /*
        System.out.println("getGreeting");
        ModelImplementation instance = new ModelImplementation();
        String expResult = "Hola Mundo";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    */
        
        String greeting =model.getGreeting();
        //asserNotNull
    }
    
}
