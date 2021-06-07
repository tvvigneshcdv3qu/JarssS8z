/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Test class for the FailModelImplementation
 * @author Adrian Corral
 */
public class FailModelImplementationTest {

    /**
     * Test of getGreeting method, of class FailModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        FailModelImplementation instance = new FailModelImplementation();
        String result = instance.getGreeting();
        assertEquals("Hola Mundo con propiedades", result);
        
    }
    
}
