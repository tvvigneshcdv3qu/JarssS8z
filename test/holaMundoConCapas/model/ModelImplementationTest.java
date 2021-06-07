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
 * Test the Model Implementation
 * @author Adrian Corral
 */
public class ModelImplementationTest {
    
    private Model model;
    
    /**
     * Set a Variable model created on the class a new Model Implementation
     */
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
